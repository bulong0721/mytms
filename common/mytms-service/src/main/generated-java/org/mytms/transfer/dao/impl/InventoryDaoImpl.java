package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.InventoryDao;
import org.mytms.transfer.domain.Inventory;
import org.mytms.transfer.domain.QInventory;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InventoryDaoImpl extends GenericEntityDaoImpl<Long, Inventory> implements InventoryDao {

    protected final QInventory path = QInventory.inventory;

    public InventoryDaoImpl() {
        super(QInventory.inventory);
    }

}

