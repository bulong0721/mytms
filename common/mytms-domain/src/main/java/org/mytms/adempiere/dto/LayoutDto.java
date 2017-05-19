package org.mytms.adempiere.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/15.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LayoutDto {
    public static final LayoutDto L_24_8 = new LayoutDto(24, 2, 22);
    public static final LayoutDto L_24_12 = new LayoutDto(24, 3, 21);

    private int colSpan;
    private int labelSpan;
    private int wrapperSpan;
}
