package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerForgotPasswordSecurityTokenDao;
import org.mytms.customer.domain.CustomerForgotPasswordSecurityToken;
import org.mytms.customer.domain.QCustomerForgotPasswordSecurityToken;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerForgotPasswordSecurityTokenDaoImpl extends GenericEntityDaoImpl<Long, CustomerForgotPasswordSecurityToken> implements CustomerForgotPasswordSecurityTokenDao {

    protected final QCustomerForgotPasswordSecurityToken path = QCustomerForgotPasswordSecurityToken.customerForgotPasswordSecurityToken;

    public CustomerForgotPasswordSecurityTokenDaoImpl() {
        super(QCustomerForgotPasswordSecurityToken.customerForgotPasswordSecurityToken);
    }

}

