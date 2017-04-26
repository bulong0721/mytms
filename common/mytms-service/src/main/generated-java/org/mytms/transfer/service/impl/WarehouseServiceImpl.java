package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.Warehouse;
import org.mytms.transfer.dao.WarehouseDao;
import org.mytms.transfer.service.WarehouseService;

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

