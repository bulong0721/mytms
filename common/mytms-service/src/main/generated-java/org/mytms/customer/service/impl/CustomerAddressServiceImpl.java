package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerAddress;
import org.mytms.customer.dao.CustomerAddressDao;
import org.mytms.customer.service.CustomerAddressService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerAddressServiceImpl extends GenericEntityServiceImpl<Long, CustomerAddress> implements CustomerAddressService {

    protected final CustomerAddressDao dao;

    @Autowired
    public CustomerAddressServiceImpl(CustomerAddressDao dao) {
        super(dao);
        this.dao = dao;
    }

}

