package org.mytms.scaffold.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/8.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "DEV_TABLE")
public class DbTable extends GenericEntity<Long, DbTable> {

    @Column(name = "table_name", length = 40, nullable = false)
    private String tableName;

    @Column(name = "use_for", length = 20)
    private String useFor;

    @Column(name = "active")
    private Boolean active;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "table", targetEntity = Field.class)
    private List<Field> fields;
}
