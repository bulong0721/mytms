package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Driver;
import org.mytms.customer.dao.DriverDao;
import org.mytms.customer.service.DriverService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class DriverServiceImpl extends GenericEntityServiceImpl<Long, Driver> implements DriverService {

    protected final DriverDao dao;

    @Autowired
    public DriverServiceImpl(DriverDao dao) {
        super(dao);
        this.dao = dao;
    }

}

