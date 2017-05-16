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
public class TableDto {
    private int editorSpan = 12;
    private int filterSpan = 6;
    private List<FieldDto> fields;
    private String key;
    private String title;
}
