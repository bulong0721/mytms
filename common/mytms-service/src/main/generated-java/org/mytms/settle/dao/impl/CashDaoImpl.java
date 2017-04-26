package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.CashDao;
import org.mytms.settle.domain.Cash;
import org.mytms.settle.domain.QCash;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CashDaoImpl extends GenericEntityDaoImpl<Long, Cash> implements CashDao {

    protected final QCash path = QCash.cash;

    public CashDaoImpl() {
        super(QCash.cash);
    }

}

