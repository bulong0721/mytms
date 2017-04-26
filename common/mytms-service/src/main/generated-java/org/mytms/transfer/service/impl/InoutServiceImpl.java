package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.Inout;
import org.mytms.transfer.dao.InoutDao;
import org.mytms.transfer.service.InoutService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InoutServiceImpl extends GenericEntityServiceImpl<Long, Inout> implements InoutService {

    protected final InoutDao dao;

    @Autowired
    public InoutServiceImpl(InoutDao dao) {
        super(dao);
        this.dao = dao;
    }

}

