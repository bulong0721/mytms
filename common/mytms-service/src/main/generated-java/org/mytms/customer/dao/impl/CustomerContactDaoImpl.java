package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerContactDao;
import org.mytms.customer.domain.CustomerContact;
import org.mytms.customer.domain.QCustomerContact;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerContactDaoImpl extends GenericEntityDaoImpl<Long, CustomerContact> implements CustomerContactDao {

    protected final QCustomerContact path = QCustomerContact.customerContact;

    public CustomerContactDaoImpl() {
        super(QCustomerContact.customerContact);
    }

}

