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
@Table(name = "ad_field")
public class ADField extends GenericEntity<Long, ADField> {

    @ManyToOne(targetEntity = ADTab.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT), name = "tab_id")
    private ADTab tab;

    @Basic
    @Column(name = "data_index", length = 40)
    private String key;

    @Basic
    @Column(name = "show_type", length = 20)
    private String showType;

    @Basic
    @Column(length = 40)
    private String title;

    @Basic
    @Column(name = "default_value", length = 60)
    private String defaultValue;

    @Basic
    private Boolean disabled;

    @Basic
    @Column(name = "not_as_column")
    private Boolean notAsColumn;

    @Basic
    @Column(name = "not_as_editor")
    private Boolean notAsEditor;

    @Basic
    @Column(name = "not_as_filter")
    private Boolean notAsFilter;

    @Basic
    @Column(name = "group_name", length = 20)
    private String group;

    @Basic
    @Column(length = 20)
    private String placeholder;
}
