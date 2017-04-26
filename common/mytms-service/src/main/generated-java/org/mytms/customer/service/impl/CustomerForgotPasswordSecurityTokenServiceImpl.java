package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerForgotPasswordSecurityToken;
import org.mytms.customer.dao.CustomerForgotPasswordSecurityTokenDao;
import org.mytms.customer.service.CustomerForgotPasswordSecurityTokenService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerForgotPasswordSecurityTokenServiceImpl extends GenericEntityServiceImpl<Long, CustomerForgotPasswordSecurityToken> implements CustomerForgotPasswordSecurityTokenService {

    protected final CustomerForgotPasswordSecurityTokenDao dao;

    @Autowired
    public CustomerForgotPasswordSecurityTokenServiceImpl(CustomerForgotPasswordSecurityTokenDao dao) {
        super(dao);
        this.dao = dao;
    }

}

