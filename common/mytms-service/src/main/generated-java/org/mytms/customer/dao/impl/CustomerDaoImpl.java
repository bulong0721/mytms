package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerDao;
import org.mytms.customer.domain.Customer;
import org.mytms.customer.domain.QCustomer;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerDaoImpl extends GenericEntityDaoImpl<Long, Customer> implements CustomerDao {

    protected final QCustomer path = QCustomer.customer;

    public CustomerDaoImpl() {
        super(QCustomer.customer);
    }

}

