package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerContact;
import org.mytms.customer.dao.CustomerContactDao;
import org.mytms.customer.service.CustomerContactService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerContactServiceImpl extends GenericEntityServiceImpl<Long, CustomerContact> implements CustomerContactService {

    protected final CustomerContactDao dao;

    @Autowired
    public CustomerContactServiceImpl(CustomerContactDao dao) {
        super(dao);
        this.dao = dao;
    }

}

