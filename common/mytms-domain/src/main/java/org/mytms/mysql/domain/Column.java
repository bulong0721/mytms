package org.mytms.mysql.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/15.
 */
@Getter
@Setter
@NoArgsConstructor
public class Column {
    private String name;
    private int dataType;
    private String typeName;
    private int size;
    private int decimalDigits;
    private int nullable;
    private String remarks;
    private String columnDef;
}
