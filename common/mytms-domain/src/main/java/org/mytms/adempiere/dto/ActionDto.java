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
    private Long id;
    private String icon;
    private String type;
    private String action;
    private Boolean popupEditor;
    private String component;
    private String key;
    private String title;
}
