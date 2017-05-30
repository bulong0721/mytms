package org.mytms.common.service.impl;

import org.mytms.common.domain.DicEntry;
import org.mytms.common.dao.DicEntryDao;
import org.mytms.common.service.DicEntryService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class DicEntryServiceImpl extends GenericEntityServiceImpl<Long, DicEntry> implements DicEntryService {

    protected final DicEntryDao dao;

    @Autowired
    public DicEntryServiceImpl(DicEntryDao dao) {
        super(dao);
        this.dao = dao;
    }

}

