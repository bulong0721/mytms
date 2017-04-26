package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.Movement;
import org.mytms.transfer.dao.MovementDao;
import org.mytms.transfer.service.MovementService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class MovementServiceImpl extends GenericEntityServiceImpl<Long, Movement> implements MovementService {

    protected final MovementDao dao;

    @Autowired
    public MovementServiceImpl(MovementDao dao) {
        super(dao);
        this.dao = dao;
    }

}

