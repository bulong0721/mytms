package org.mytms.adempiere.domain;

import com.google.common.collect.Lists;
import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.jdbc.meta.FieldMapping;
import org.apache.openjpa.jdbc.schema.Column;
import org.apache.openjpa.meta.JavaTypes;

import java.util.List;
import java.util.Random;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
public class AntDUtils {
    public static List<ADAction> actions = Lists.newArrayList();

    static {
        ADAction action = new ADAction();
        action.setIcon("plus-circle-o");
        action.setType("primary");
        action.setTitle("新增");
        action.setPopupEditor(true);
        action.setAction("manager/save");
        actions.add(action);
    }

    public static ADForm toForm(ClassMapping cls) {
        ADForm form = new ADForm();
        form.setFilterSpan(6);
        form.setEditorSpan(8);
        List<ADField> fields = Lists.newArrayList();
        int filterCount = 2 + new Random().nextInt(5);
        int columnCount = 8 + new Random().nextInt(8);
        for (FieldMapping fld : cls.getFieldMappings()) {
            ADField field = toField(fld);
            if (filterCount < 0) {
                field.setNotAsFilter(true);
            }
            if (columnCount < 0) {
                field.setNotAsColumn(true);
            }
            fields.add(field);
            filterCount--;
            columnCount--;
        }
        form.setFields(fields);
        form.setActions(actions);
        return form;
    }

    static boolean isEmpty(String text) {
        return (text == null || text.trim().length() == 0);
    }

    static ADField toField(FieldMapping fld) {
        Column column = fld.getColumns()[0];
        ADField field = new ADField();
        field.setKey(fld.getName());
        String title = column.getComment();
        if (title.contains("(")) {
            title = title.substring(0, title.indexOf('('));
        }
        if (null == title || title.length() == 0) {
            title = fld.getName();
        }
        ShowType showType = ShowType.Input;
        switch (column.getJavaType()) {
            case JavaTypes.INT:
            case JavaTypes.NUMBER:
            case JavaTypes.BYTE:
            case JavaTypes.LONG:
            case JavaTypes.SHORT:
            case JavaTypes.BYTE_OBJ:
            case JavaTypes.INT_OBJ:
            case JavaTypes.LONG_OBJ:
            case JavaTypes.SHORT_OBJ:
            case JavaTypes.BIGDECIMAL:
                showType = ShowType.Number;
                break;
            case JavaTypes.BOOLEAN:
            case JavaTypes.BOOLEAN_OBJ:
                showType = ShowType.Switch;
                field.setRender(ADComponent.simple("Formatter.yesOrNo"));
                break;
            case JavaTypes.DATE:
                showType = ShowType.Datetime;
                break;
        }
        if (fld.getName().endsWith("Type")) {
            showType = ShowType.Select;
            field.setOptions(ADComponent.simple("[]"));
        }
        if (column.isPrimaryKey()) {
            showType = ShowType.ID;
            field.setDisabled(true);
        }
        field.setShowType(showType);
        field.setTitle(title);
        field.setDefaultValue(column.getDefaultString());
        return field;
    }
}
