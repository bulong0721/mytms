package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerAddressDao;
import org.mytms.customer.domain.CustomerAddress;
import org.mytms.customer.domain.QCustomerAddress;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerAddressDaoImpl extends GenericEntityDaoImpl<Long, CustomerAddress> implements CustomerAddressDao {

    protected final QCustomerAddress path = QCustomerAddress.customerAddress;

    public CustomerAddressDaoImpl() {
        super(QCustomerAddress.customerAddress);
    }

}

