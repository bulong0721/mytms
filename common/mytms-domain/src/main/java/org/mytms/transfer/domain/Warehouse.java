package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_WAREHOUSE")
public class Warehouse extends OrgAssignedEntity<Long, Warehouse> {

    @Column(name = "OWNER_ORG_ID")
    private Long ownerOrg;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NAME", nullable = false, length = 20)
    private String name;

    @Column(name = "START")
    private boolean start = true;

    @Column(name = "TERMINAL")
    private boolean terminal = true;
}
