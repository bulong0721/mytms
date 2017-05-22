package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.EquipmentDao;
import org.mytms.customer.domain.Equipment;
import org.mytms.customer.domain.QEquipment;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class EquipmentDaoImpl extends GenericEntityDaoImpl<Long, Equipment> implements EquipmentDao {

    protected final QEquipment path = QEquipment.equipment;

    public EquipmentDaoImpl() {
        super(QEquipment.equipment);
    }

}

