package org.mytms.adempiere.dto;

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
public class TabDto {
    private Long id;

    private String key;

    private String title;

    private int editorSpan = 12;

    private int filterSpan = 6;

    private boolean nested = false;

    private List<ActionDto> actions;

    private List<FieldDto> fields;

    private Integer nestedIndex;

    private List<NestedDto> nestedTables;
}
