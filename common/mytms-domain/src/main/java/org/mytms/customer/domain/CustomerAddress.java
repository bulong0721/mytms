package org.mytms.customer.domain;

import org.mytms.common.GenericEntity;
import org.mytms.profile.domain.Address;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_CUSTOMER_ADDRESS")
public class CustomerAddress extends GenericEntity<Long, CustomerAddress> {

    @Column(name = "ADDRESS_NAME")
    protected String addressName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = Customer.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CUSTOMER_ID")
    protected Customer customer;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = Address.class, optional = false)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ADDRESS_ID")
    protected Address address;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CustomerAddress that = (CustomerAddress) o;

        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;
        if (customer != null ? !customer.equals(that.customer) : that.customer != null) return false;
        return !(address != null ? !address.equals(that.address) : that.address != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
