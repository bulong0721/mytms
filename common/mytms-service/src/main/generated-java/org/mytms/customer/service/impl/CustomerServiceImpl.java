package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Customer;
import org.mytms.customer.dao.CustomerDao;
import org.mytms.customer.service.CustomerService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerServiceImpl extends GenericEntityServiceImpl<Long, Customer> implements CustomerService {

    protected final CustomerDao dao;

    @Autowired
    public CustomerServiceImpl(CustomerDao dao) {
        super(dao);
        this.dao = dao;
    }

}

