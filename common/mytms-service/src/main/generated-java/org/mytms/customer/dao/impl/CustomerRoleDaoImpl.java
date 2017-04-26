package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerRoleDao;
import org.mytms.customer.domain.CustomerRole;
import org.mytms.customer.domain.QCustomerRole;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerRoleDaoImpl extends GenericEntityDaoImpl<Long, CustomerRole> implements CustomerRoleDao {

    protected final QCustomerRole path = QCustomerRole.customerRole;

    public CustomerRoleDaoImpl() {
        super(QCustomerRole.customerRole);
    }

}

