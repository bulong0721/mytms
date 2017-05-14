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
@Table(name = "ad_field_group")
public class ADFieldGroup extends GenericEntity<Long, ADFieldGroup> {

    @ManyToOne(targetEntity = ADTab.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT), name = "tab_id")
    private ADTab tab;

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20, nullable = false)
    private String title;

    @Basic
    private Integer sorter;
}
