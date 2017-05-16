package org.mytms.mysql.service.impl;

import com.google.common.collect.Lists;
import org.mytms.adempiere.domain.ShowType;
import org.mytms.adempiere.dto.FieldDto;
import org.mytms.adempiere.dto.UsingDto;
import org.mytms.mysql.domain.Column;
import org.mytms.mysql.domain.Table;
import org.mytms.mysql.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/15.
 */
@Service
public class MetaServiceImpl implements MetaService {

    @Autowired
    DataSource dataSource;

    public List<Table> allTable() {
        return null;
    }

    public List<FieldDto> listFieldsByTable(String table) {
        List<FieldDto> resultList = Lists.newArrayList();
        ResultSet resultSet = null;
        try {
            Connection connection = dataSource.getConnection();
            DatabaseMetaData meta = connection.getMetaData();
            resultSet = meta.getColumns(null, null, table, null);
            while (resultSet != null && resultSet.next()) {
                Column column = newColumn(resultSet);
                resultList.add(toField(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != resultSet) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultList;
    }

    Column newColumn(ResultSet col) throws SQLException {
        Column c = new Column();
        c.setName(col.getString("COLUMN_NAME"));
        c.setDataType(col.getInt("DATA_TYPE"));
        c.setTypeName(col.getString("TYPE_NAME"));
        c.setSize(col.getInt("COLUMN_SIZE"));
        c.setDecimalDigits(col.getInt("DECIMAL_DIGITS"));
        c.setNullable(col.getInt("NULLABLE"));
        c.setRemarks(col.getString("REMARKS"));
        c.setColumnDef(col.getString("COLUMN_DEF"));

        return c;
    }

    FieldDto toField(Column col) {
        FieldDto field = new FieldDto();
        field.setKey(col.getName());
        String title = col.getRemarks();
        if (title.contains("(")) {
            title = title.substring(0, title.indexOf('('));
        }
        if (null == title || title.length() == 0) {
            title = col.getName();
        }
        ShowType showType = ShowType.Input;
        switch (col.getDataType()) {
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
                field.setRender(UsingDto.simple("Formatter.yesOrNo"));
                break;
            case JavaTypes.DATE:
                showType = ShowType.Datetime;
                break;
        }
        if (col.getName().endsWith("Type")) {
            showType = ShowType.Select;
        }
        field.setShowType(showType.getValue());
        field.setTitle(title);
        return field;
    }
}
