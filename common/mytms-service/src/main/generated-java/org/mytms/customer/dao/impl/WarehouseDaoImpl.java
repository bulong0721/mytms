package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.WarehouseDao;
import org.mytms.customer.domain.Warehouse;
import org.mytms.customer.domain.QWarehouse;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class WarehouseDaoImpl extends GenericEntityDaoImpl<Long, Warehouse> implements WarehouseDao {

    protected final QWarehouse path = QWarehouse.warehouse;

    public WarehouseDaoImpl() {
        super(QWarehouse.warehouse);
    }

}

