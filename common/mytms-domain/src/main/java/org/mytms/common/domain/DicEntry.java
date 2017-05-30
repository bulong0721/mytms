package org.mytms.common.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.mytms.common.GenericEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cd_dictionary")
public class DicEntry extends GenericEntity<Long, DicEntry> {
    @Column(name = "name_cn", length = 50)
    private String key;
    @Column(name = "code", length = 50)
    private String value;
    @Column(name = "parent_id")
    private Long groupId;
}
