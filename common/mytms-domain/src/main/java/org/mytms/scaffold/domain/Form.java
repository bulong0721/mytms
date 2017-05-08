package org.mytms.scaffold.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Martin.Xu on 2017/5/8.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "DEV_FORM")
public class Form extends GenericEntity<Long, Form> {

    @Column(name = "table_name")
    private String tableName;

    @OneToMany(targetEntity = Operator.class, fetch = FetchType.EAGER)
    @JoinTable(name = "DEV_FORM_ACTION_XREF", joinColumns = @JoinColumn(name = "form_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "action_id", referencedColumnName = "id"))
    private Set<Operator> actions;

    @OneToOne(targetEntity = DbTable.class, fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "table_id", referencedColumnName = "id")
    private DbTable mainTable;

    @OneToMany(targetEntity = DbTable.class, fetch = FetchType.EAGER)
    @JoinTable(name = "DEV_FORM_TABLE_XREF", joinColumns = @JoinColumn(name = "form_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "table_id", referencedColumnName = "id"))
    private Set<DbTable> nestedTables;
}
