package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.VehicleDao;
import org.mytms.customer.domain.Vehicle;
import org.mytms.customer.domain.QVehicle;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class VehicleDaoImpl extends GenericEntityDaoImpl<Long, Vehicle> implements VehicleDao {

    protected final QVehicle path = QVehicle.vehicle;

    public VehicleDaoImpl() {
        super(QVehicle.vehicle);
    }

}

