package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerAttributeDao;
import org.mytms.customer.domain.CustomerAttribute;
import org.mytms.customer.domain.QCustomerAttribute;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerAttributeDaoImpl extends GenericEntityDaoImpl<Long, CustomerAttribute> implements CustomerAttributeDao {

    protected final QCustomerAttribute path = QCustomerAttribute.customerAttribute;

    public CustomerAttributeDaoImpl() {
        super(QCustomerAttribute.customerAttribute);
    }

}

