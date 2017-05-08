package org.mytms.scaffold.service.impl;

import org.mytms.scaffold.domain.DbTable;
import org.mytms.scaffold.dao.DbTableDao;
import org.mytms.scaffold.service.DbTableService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class DbTableServiceImpl extends GenericEntityServiceImpl<Long, DbTable> implements DbTableService {

    protected final DbTableDao dao;

    @Autowired
    public DbTableServiceImpl(DbTableDao dao) {
        super(dao);
        this.dao = dao;
    }

}

