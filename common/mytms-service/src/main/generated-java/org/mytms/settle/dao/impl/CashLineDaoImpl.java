package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.CashLineDao;
import org.mytms.settle.domain.CashLine;
import org.mytms.settle.domain.QCashLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CashLineDaoImpl extends GenericEntityDaoImpl<Long, CashLine> implements CashLineDao {

    protected final QCashLine path = QCashLine.cashLine;

    public CashLineDaoImpl() {
        super(QCashLine.cashLine);
    }

}

