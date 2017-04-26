package org.mytms.settle.service.impl;

import org.mytms.settle.domain.AllocationLine;
import org.mytms.settle.dao.AllocationLineDao;
import org.mytms.settle.service.AllocationLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class AllocationLineServiceImpl extends GenericEntityServiceImpl<Long, AllocationLine> implements AllocationLineService {

    protected final AllocationLineDao dao;

    @Autowired
    public AllocationLineServiceImpl(AllocationLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

