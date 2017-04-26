package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.VehicleTypeDao;
import org.mytms.transfer.domain.VehicleType;
import org.mytms.transfer.domain.QVehicleType;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class VehicleTypeDaoImpl extends GenericEntityDaoImpl<Long, VehicleType> implements VehicleTypeDao {

    protected final QVehicleType path = QVehicleType.vehicleType;

    public VehicleTypeDaoImpl() {
        super(QVehicleType.vehicleType);
    }

}

