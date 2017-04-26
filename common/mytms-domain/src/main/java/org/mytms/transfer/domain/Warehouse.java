package org.mytms.transfer.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(Long ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isTerminal() {
        return terminal;
    }

    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }
}
