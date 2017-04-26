package org.mytms.customer.domain;

import org.mytms.common.GenericEntity;
import org.mytms.profile.domain.Phone;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_CUSTOMER_PHONE")
public class CustomerPhone extends GenericEntity<Long, CustomerPhone> {

    @Column(name = "PHONE_NAME")
    protected String phoneName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = Customer.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CUSTOMER_ID")
    protected Customer customer;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Phone.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "PHONE_ID")
    protected Phone phone;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomerPhone that = (CustomerPhone) o;

        if (phoneName != null ? !phoneName.equals(that.phoneName) : that.phoneName != null) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        return !(phone != null ? !phone.equals(that.phone) : that.phone != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (phoneName != null ? phoneName.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
