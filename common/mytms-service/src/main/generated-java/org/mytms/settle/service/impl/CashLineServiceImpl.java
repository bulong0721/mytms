package org.mytms.settle.service.impl;

import org.mytms.settle.domain.CashLine;
import org.mytms.settle.dao.CashLineDao;
import org.mytms.settle.service.CashLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CashLineServiceImpl extends GenericEntityServiceImpl<Long, CashLine> implements CashLineService {

    protected final CashLineDao dao;

    @Autowired
    public CashLineServiceImpl(CashLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

