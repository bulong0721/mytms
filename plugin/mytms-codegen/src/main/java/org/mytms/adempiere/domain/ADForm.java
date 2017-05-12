package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
public class ADForm extends ADTable {

    private List<ADAction> actions;

    private Integer nestedIndex;

    private List<ADTable> nestedTables;
}
