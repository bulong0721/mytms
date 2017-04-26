package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.MovementLine;
import org.mytms.transfer.dao.MovementLineDao;
import org.mytms.transfer.service.MovementLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class MovementLineServiceImpl extends GenericEntityServiceImpl<Long, MovementLine> implements MovementLineService {

    protected final MovementLineDao dao;

    @Autowired
    public MovementLineServiceImpl(MovementLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

