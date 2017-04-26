package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.InoutDao;
import org.mytms.transfer.domain.Inout;
import org.mytms.transfer.domain.QInout;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InoutDaoImpl extends GenericEntityDaoImpl<Long, Inout> implements InoutDao {

    protected final QInout path = QInout.inout;

    public InoutDaoImpl() {
        super(QInout.inout);
    }

}

