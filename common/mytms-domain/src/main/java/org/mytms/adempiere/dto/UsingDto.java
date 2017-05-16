package org.mytms.adempiere.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsingDto {
    private String name;
    private String file;

    public static UsingDto simple(String name) {
        return new UsingDto(name, null);
    }
}
