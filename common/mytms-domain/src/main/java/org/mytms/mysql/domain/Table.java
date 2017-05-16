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
public class Table {
    private String category;
    private String schema;
    private String name;
    private String remarks;
}
