package org.mytms.customer.domain;

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
@Table(name = "RES_CUSTOMER_ATTRIBUTE")
public class CustomerAttribute extends GenericEntity<Long, CustomerAttribute> {

    @Column(name = "NAME", nullable=false)
    protected String name;

    /** The value. */
    @Column(name = "VALUE")
    protected String value;

    /** The customer. */
    @ManyToOne(targetEntity = Customer.class, optional=false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CUSTOMER_ID")
    protected Customer customer;
}
