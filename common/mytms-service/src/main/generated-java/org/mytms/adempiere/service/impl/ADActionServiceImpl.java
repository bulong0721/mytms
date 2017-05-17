package org.mytms.adempiere.service.impl;

import org.mytms.adempiere.domain.ADAction;
import org.mytms.adempiere.dao.ADActionDao;
import org.mytms.adempiere.service.ADActionService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ADActionServiceImpl extends GenericEntityServiceImpl<Long, ADAction> implements ADActionService {

    protected final ADActionDao dao;

    @Autowired
    public ADActionServiceImpl(ADActionDao dao) {
        super(dao);
        this.dao = dao;
    }

}

