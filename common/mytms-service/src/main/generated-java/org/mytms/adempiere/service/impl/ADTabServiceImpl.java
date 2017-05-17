package org.mytms.adempiere.service.impl;

import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.dao.ADTabDao;
import org.mytms.adempiere.service.ADTabService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ADTabServiceImpl extends GenericEntityServiceImpl<Long, ADTab> implements ADTabService {

    protected final ADTabDao dao;

    @Autowired
    public ADTabServiceImpl(ADTabDao dao) {
        super(dao);
        this.dao = dao;
    }

}

