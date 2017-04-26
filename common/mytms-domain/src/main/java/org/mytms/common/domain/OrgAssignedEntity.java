package org.mytms.common.domain;

import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class OrgAssignedEntity<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>> extends GenericEntity<K, E> {
    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "org_id")
    private Org org;

    public Org getOrg() {
        return org;
    }

    public void setOrg(Org org) {
        this.org = org;
    }

    /**
     * @return a description of this entity
     */
    public String toShortString() {
        return super.toShortString() + "[org=" + org.getNumber() + "]";
    }

}
