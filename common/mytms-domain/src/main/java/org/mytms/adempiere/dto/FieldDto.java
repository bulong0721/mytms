package org.mytms.adempiere.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/16.
 */
@Getter
@Setter
@NoArgsConstructor
public class FieldDto {
    private Long id;

    private String key;

    private String showType;

    private String title;

    private String group;

    private Integer size;

    private List<OptionDto> options;

    private UsingDto render;

    private Boolean disabled;

    private Boolean notAsFilter;

    private Boolean notAsColumn;

    private Boolean notAsEditor;

    private List<FieldDto> child;

    private LayoutDto layout;
}
