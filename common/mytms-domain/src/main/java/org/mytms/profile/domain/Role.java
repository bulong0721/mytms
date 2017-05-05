package org.mytms.profile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_ROLE")
public class Role extends GenericEntity<Long, Role> {

    @Column(name = "ROLE_NAME", length = 20, nullable = false)
    protected String roleName;

    @Column(name = "DESCRIPTION")
    protected String description;
}
