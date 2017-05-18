package org.mytms.adempiere.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class NestedDto {
    private Long id;

    private String key;

    private String title;

    private List<FieldDto> fields;

    private Boolean disableNew;

    private Boolean disableEdit;

    private Boolean disableRemove;

    private Integer sorter;
}
