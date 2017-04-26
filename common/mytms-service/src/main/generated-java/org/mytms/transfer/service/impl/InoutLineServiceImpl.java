package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.InoutLine;
import org.mytms.transfer.dao.InoutLineDao;
import org.mytms.transfer.service.InoutLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InoutLineServiceImpl extends GenericEntityServiceImpl<Long, InoutLine> implements InoutLineService {

    protected final InoutLineDao dao;

    @Autowired
    public InoutLineServiceImpl(InoutLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

