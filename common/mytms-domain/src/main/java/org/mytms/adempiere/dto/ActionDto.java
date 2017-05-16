package org.mytms.adempiere.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
public class ActionDto {
    private String icon;
    private String type;
    private String action;
    private Boolean popupEditor;
    private UsingDto component;
    private String key;
    private String title;
}
