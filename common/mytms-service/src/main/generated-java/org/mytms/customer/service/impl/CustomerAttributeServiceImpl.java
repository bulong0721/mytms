package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerAttribute;
import org.mytms.customer.dao.CustomerAttributeDao;
import org.mytms.customer.service.CustomerAttributeService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerAttributeServiceImpl extends GenericEntityServiceImpl<Long, CustomerAttribute> implements CustomerAttributeService {

    protected final CustomerAttributeDao dao;

    @Autowired
    public CustomerAttributeServiceImpl(CustomerAttributeDao dao) {
        super(dao);
        this.dao = dao;
    }

}

