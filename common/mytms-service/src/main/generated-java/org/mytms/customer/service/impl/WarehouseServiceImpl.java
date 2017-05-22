package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Warehouse;
import org.mytms.customer.dao.WarehouseDao;
import org.mytms.customer.service.WarehouseService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class WarehouseServiceImpl extends GenericEntityServiceImpl<Long, Warehouse> implements WarehouseService {

    protected final WarehouseDao dao;

    @Autowired
    public WarehouseServiceImpl(WarehouseDao dao) {
        super(dao);
        this.dao = dao;
    }

}

