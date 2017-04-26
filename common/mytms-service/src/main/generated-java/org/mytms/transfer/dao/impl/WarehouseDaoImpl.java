package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.WarehouseDao;
import org.mytms.transfer.domain.Warehouse;
import org.mytms.transfer.domain.QWarehouse;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class WarehouseDaoImpl extends GenericEntityDaoImpl<Long, Warehouse> implements WarehouseDao {

    protected final QWarehouse path = QWarehouse.warehouse;

    public WarehouseDaoImpl() {
        super(QWarehouse.warehouse);
    }

}

