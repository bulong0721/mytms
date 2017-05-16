package org.mytms.adempiere.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/16.
 */
@Getter
@Setter
@NoArgsConstructor
public class FieldDto {

    private String key;

    private String showType;

    private String title;

    private String grpTitle;

    private Integer size;

    private UsingDto options;

    private UsingDto render;

    private Boolean disabled;

    private Boolean notAsFilter = true;

    private Boolean notAsColumn = true;

    private Boolean notAsEditor = true;
}
