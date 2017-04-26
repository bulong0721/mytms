package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.VehicleType;
import org.mytms.transfer.dao.VehicleTypeDao;
import org.mytms.transfer.service.VehicleTypeService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class VehicleTypeServiceImpl extends GenericEntityServiceImpl<Long, VehicleType> implements VehicleTypeService {

    protected final VehicleTypeDao dao;

    @Autowired
    public VehicleTypeServiceImpl(VehicleTypeDao dao) {
        super(dao);
        this.dao = dao;
    }

}

