package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
public class ADAction extends ADObject {
    private String icon;
    private String type;
    private String action;
    private Boolean popupEditor;
    private ADComponent component;
}
