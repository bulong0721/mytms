package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.Inventory;
import org.mytms.transfer.dao.InventoryDao;
import org.mytms.transfer.service.InventoryService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InventoryServiceImpl extends GenericEntityServiceImpl<Long, Inventory> implements InventoryService {

    protected final InventoryDao dao;

    @Autowired
    public InventoryServiceImpl(InventoryDao dao) {
        super(dao);
        this.dao = dao;
    }

}

