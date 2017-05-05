package org.mytms.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.profile.domain.Role;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_CUSTOMER_ROLE")
public class CustomerRole extends OrgAssignedEntity<Long, CustomerRole> {

    @ManyToOne(targetEntity = Customer.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CUSTOMER_ID")
    protected Customer customer;

    @ManyToOne(targetEntity = Role.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ROLE_ID")
    protected Role role;
}
