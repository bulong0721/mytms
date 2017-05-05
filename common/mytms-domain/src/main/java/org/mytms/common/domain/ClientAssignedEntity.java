package org.mytms.common.domain;

import lombok.Data;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class ClientAssignedEntity<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>> extends GenericEntity<K, E> {
    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "client_id")
    private Client client;

    /**
     * @return a description of this entity
     */
    public String toShortString() {
        return super.toShortString() + "[client=" + client.getNumber() + "]";
    }

}
