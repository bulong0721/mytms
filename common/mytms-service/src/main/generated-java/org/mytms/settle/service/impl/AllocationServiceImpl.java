package org.mytms.settle.service.impl;

import org.mytms.settle.domain.Allocation;
import org.mytms.settle.dao.AllocationDao;
import org.mytms.settle.service.AllocationService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class AllocationServiceImpl extends GenericEntityServiceImpl<Long, Allocation> implements AllocationService {

    protected final AllocationDao dao;

    @Autowired
    public AllocationServiceImpl(AllocationDao dao) {
        super(dao);
        this.dao = dao;
    }

}

