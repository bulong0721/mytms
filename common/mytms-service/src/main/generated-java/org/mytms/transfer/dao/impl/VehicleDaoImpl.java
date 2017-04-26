package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.VehicleDao;
import org.mytms.transfer.domain.Vehicle;
import org.mytms.transfer.domain.QVehicle;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class VehicleDaoImpl extends GenericEntityDaoImpl<Long, Vehicle> implements VehicleDao {

    protected final QVehicle path = QVehicle.vehicle;

    public VehicleDaoImpl() {
        super(QVehicle.vehicle);
    }

}

