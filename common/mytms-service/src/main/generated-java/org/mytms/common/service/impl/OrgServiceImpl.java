package org.mytms.common.service.impl;

import org.mytms.common.domain.Org;
import org.mytms.common.dao.OrgDao;
import org.mytms.common.service.OrgService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class OrgServiceImpl extends GenericEntityServiceImpl<Long, Org> implements OrgService {

    protected final OrgDao dao;

    @Autowired
    public OrgServiceImpl(OrgDao dao) {
        super(dao);
        this.dao = dao;
    }

}

