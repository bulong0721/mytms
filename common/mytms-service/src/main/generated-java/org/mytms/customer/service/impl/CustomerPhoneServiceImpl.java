package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerPhone;
import org.mytms.customer.dao.CustomerPhoneDao;
import org.mytms.customer.service.CustomerPhoneService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerPhoneServiceImpl extends GenericEntityServiceImpl<Long, CustomerPhone> implements CustomerPhoneService {

    protected final CustomerPhoneDao dao;

    @Autowired
    public CustomerPhoneServiceImpl(CustomerPhoneDao dao) {
        super(dao);
        this.dao = dao;
    }

}

