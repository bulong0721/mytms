package org.mytms.scaffold.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin.Xu on 2017/5/8.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "DEV_FIELD")
public class Field extends GenericEntity<Long, Field> {

    @ManyToOne(targetEntity = DbTable.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "table_id")
    private DbTable table;

    @Column(name = "title", length = 20)
    private String title;

    @Column(name = "data_index", length = 20)
    private String key;

    @Column(name = "show_type")
    private String showType;

    @Column(name = "disabled")
    private Boolean disabled;

    @Column(name = "not_as_filter")
    private Boolean notAsFilter;

    @Column(name = "not_as_column")
    private Boolean notAsColumn;

    @Column(name = "not_as_editor")
    private Boolean notAsEditor;

    @Column(name = "default_value", length = 60)
    private String defaultValue;

    @Column(name = "size", length = 10)
    private String size;

    @Column(name = "placeholder", length = 20)
    private String placeholder;

}
