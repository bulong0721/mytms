package org.mytms.adempiere.domain;

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
public class ADComponent {
    private String name;
    private String file;

    public static ADComponent simple(String name) {
        return new ADComponent(name, null);
    }
}
