package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by admin on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="ad_column")
public class ADColumn extends GenericEntity<Long, ADColumn> {

    @ManyToOne(targetEntity = ADTab.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "table_id")
    private ADTable table;

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20)
    private String title;


}
