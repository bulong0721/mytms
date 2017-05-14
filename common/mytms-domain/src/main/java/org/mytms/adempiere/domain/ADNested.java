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
@Table(name = "ad_nested")
public class ADNested extends GenericEntity<Long, ADNested> {

    @ManyToOne(targetEntity = ADTab.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "tab_id")
    private ADTab tab;

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20, nullable = false)
    private String title;

    @ManyToOne(targetEntity = ADTab.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "actual_tab_id")
    private ADTab actualTab;

    @Basic
    @Column(name = "disable_new")
    private Boolean disableNew;

    @Basic
    @Column(name = "disable_edit")
    private Boolean disableEdit;

    @Basic
    @Column(name = "disable_remove")
    private Boolean disableRemove;

    @Basic
    private Integer sorter;
}
