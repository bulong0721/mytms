package org.mytms.adempiere.service.impl;

import org.mytms.adempiere.domain.ADField;
import org.mytms.adempiere.dao.ADFieldDao;
import org.mytms.adempiere.service.ADFieldService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ADFieldServiceImpl extends GenericEntityServiceImpl<Long, ADField> implements ADFieldService {

    protected final ADFieldDao dao;

    @Autowired
    public ADFieldServiceImpl(ADFieldDao dao) {
        super(dao);
        this.dao = dao;
    }

}

