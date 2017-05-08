package org.mytms.scaffold.dao.impl;

import org.mytms.scaffold.dao.DbTableDao;
import org.mytms.scaffold.domain.DbTable;
import org.mytms.scaffold.domain.QDbTable;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class DbTableDaoImpl extends GenericEntityDaoImpl<Long, DbTable> implements DbTableDao {

    protected final QDbTable path = QDbTable.dbTable;

    public DbTableDaoImpl() {
        super(QDbTable.dbTable);
    }

}

