package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Vehicle;
import org.mytms.customer.dao.VehicleDao;
import org.mytms.customer.service.VehicleService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class VehicleServiceImpl extends GenericEntityServiceImpl<Long, Vehicle> implements VehicleService {

    protected final VehicleDao dao;

    @Autowired
    public VehicleServiceImpl(VehicleDao dao) {
        super(dao);
        this.dao = dao;
    }

}

