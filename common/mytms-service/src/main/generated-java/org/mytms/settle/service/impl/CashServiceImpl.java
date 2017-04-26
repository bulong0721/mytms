package org.mytms.settle.service.impl;

import org.mytms.settle.domain.Cash;
import org.mytms.settle.dao.CashDao;
import org.mytms.settle.service.CashService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CashServiceImpl extends GenericEntityServiceImpl<Long, Cash> implements CashService {

    protected final CashDao dao;

    @Autowired
    public CashServiceImpl(CashDao dao) {
        super(dao);
        this.dao = dao;
    }

}

