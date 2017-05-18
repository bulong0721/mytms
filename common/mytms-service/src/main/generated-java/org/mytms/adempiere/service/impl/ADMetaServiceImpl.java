package org.mytms.adempiere.service.impl;

import com.google.common.collect.Lists;
import org.mytms.adempiere.dto.FieldDto;
import org.mytms.adempiere.dto.ShowType;
import org.mytms.adempiere.dto.ColumnDto;
import org.mytms.adempiere.service.ADMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/15.
 */
@Service
public class ADMetaServiceImpl implements ADMetaService {

    @Autowired
    DataSource dataSource;

    public List<FieldDto> listFieldsByTable(String table) {
        List<FieldDto> resultList = Lists.newArrayList();
        ResultSet resultSet = null;
        try {
            Connection connection = dataSource.getConnection();
            DatabaseMetaData meta = connection.getMetaData();
            resultSet = meta.getColumns(null, null, table, null);
            while (resultSet != null && resultSet.next()) {
                ColumnDto column = newColumn(resultSet);
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

    ColumnDto newColumn(ResultSet col) throws SQLException {
        ColumnDto c = new ColumnDto();
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

    FieldDto toField(ColumnDto col) {
        FieldDto field = new FieldDto();
        String camelStyle = VarNameUtil.toCamelCase(col.getName());
        field.setKey(camelStyle);
        String title = col.getRemarks();
        if (title.contains("(")) {
            title = title.substring(0, title.indexOf('('));
        }
        if (null == title || title.length() == 0) {
            title = col.getName();
        }
        ShowType showType = ShowType.Input;
        switch (col.getDataType()) {
            case Types.INTEGER:
            case Types.BIGINT:
            case Types.DOUBLE:
            case Types.FLOAT:
            case Types.REAL:
            case Types.DECIMAL:
            case Types.SMALLINT:
            case Types.TINYINT:
            case Types.NUMERIC:
                showType = ShowType.Number;
                break;
            case Types.BIT:
            case Types.BOOLEAN:
                showType = ShowType.Switch;
//                field.setRender(UsingDto.simple("Formatter.yesOrNo"));
                break;
            case Types.DATE:
            case Types.TIME:
            case Types.TIMESTAMP:
            case Types.TIME_WITH_TIMEZONE:
            case Types.TIMESTAMP_WITH_TIMEZONE:
                showType = ShowType.Datetime;
                break;
            default:
                break;
        }
        if (camelStyle.equalsIgnoreCase("id")) {
            showType = ShowType.ID;
        } else if (camelStyle.endsWith("Type")) {
            showType = ShowType.Select;
            field.setOptions(Lists.newArrayList());
        }
        field.setShowType(showType.getValue());
        field.setTitle(title);
        return field;
    }
}
