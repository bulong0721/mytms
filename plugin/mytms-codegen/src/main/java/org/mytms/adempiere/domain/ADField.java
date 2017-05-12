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
public class ADField extends ADObject {

    private String showType;

    private Boolean disabled;

    private Boolean notAsFilter;

    private Boolean notAsColumn;

    private Boolean notAsEditor;

    private String defaultValue;

    private String placeholder;

    private ADComponent options;

    private ADComponent render;

    private List<ADField> child;

    public void setShowType(ShowType showType) {
        this.showType = showType.getValue();
    }
}
