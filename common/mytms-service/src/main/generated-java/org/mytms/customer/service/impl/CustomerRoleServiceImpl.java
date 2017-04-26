package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerRole;
import org.mytms.customer.dao.CustomerRoleDao;
import org.mytms.customer.service.CustomerRoleService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerRoleServiceImpl extends GenericEntityServiceImpl<Long, CustomerRole> implements CustomerRoleService {

    protected final CustomerRoleDao dao;

    @Autowired
    public CustomerRoleServiceImpl(CustomerRoleDao dao) {
        super(dao);
        this.dao = dao;
    }

}

