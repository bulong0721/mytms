package org.mytms.customer.domain;

import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.profile.domain.Role;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_CUSTOMER_ROLE")
public class CustomerRole extends OrgAssignedEntity<Long, CustomerRole> {

    @ManyToOne(targetEntity = Customer.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CUSTOMER_ID")
    protected Customer customer;

    @ManyToOne(targetEntity = Role.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ROLE_ID")
    protected Role role;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRoleName() {
        return role.getRoleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomerRole that = (CustomerRole) o;

        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        return !(role != null ? !role.equals(that.role) : that.role != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
