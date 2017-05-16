package org.mytms.adempiere.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.adempiere.domain.ADAction;
import org.mytms.adempiere.domain.ADTable;

import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
public class TabDto extends ADTable {

    private List<ADAction> actions;

    private Integer nestedIndex;

    private List<ADTable> nestedTables;
}
