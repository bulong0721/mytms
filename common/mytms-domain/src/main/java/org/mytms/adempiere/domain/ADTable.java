package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="ad_table")
public class ADTable extends GenericEntity<Long, ADTable> {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "table", targetEntity = ADColumn.class)
    private List<ADColumn> columns;

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20)
    private String title;

}
