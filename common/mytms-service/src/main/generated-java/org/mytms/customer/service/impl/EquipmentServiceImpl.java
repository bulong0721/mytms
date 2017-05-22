package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Equipment;
import org.mytms.customer.dao.EquipmentDao;
import org.mytms.customer.service.EquipmentService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class EquipmentServiceImpl extends GenericEntityServiceImpl<Long, Equipment> implements EquipmentService {

    protected final EquipmentDao dao;

    @Autowired
    public EquipmentServiceImpl(EquipmentDao dao) {
        super(dao);
        this.dao = dao;
    }

}

