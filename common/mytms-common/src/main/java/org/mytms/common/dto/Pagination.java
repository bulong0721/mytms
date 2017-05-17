package org.mytms.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Administrator on 2016/6/6.
 */
@Setter
@Getter
@NoArgsConstructor
public class Pagination {
    private Integer current;
    private Integer total;
}
