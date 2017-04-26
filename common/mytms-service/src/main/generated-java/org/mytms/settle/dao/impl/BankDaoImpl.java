package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.BankDao;
import org.mytms.settle.domain.Bank;
import org.mytms.settle.domain.QBank;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class BankDaoImpl extends GenericEntityDaoImpl<Long, Bank> implements BankDao {

    protected final QBank path = QBank.bank;

    public BankDaoImpl() {
        super(QBank.bank);
    }

}

