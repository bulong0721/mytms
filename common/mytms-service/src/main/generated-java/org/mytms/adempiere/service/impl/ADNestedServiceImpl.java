package org.mytms.adempiere.service.impl;

import org.mytms.adempiere.domain.ADNested;
import org.mytms.adempiere.dao.ADNestedDao;
import org.mytms.adempiere.service.ADNestedService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ADNestedServiceImpl extends GenericEntityServiceImpl<Long, ADNested> implements ADNestedService {

    protected final ADNestedDao dao;

    @Autowired
    public ADNestedServiceImpl(ADNestedDao dao) {
        super(dao);
        this.dao = dao;
    }

}

