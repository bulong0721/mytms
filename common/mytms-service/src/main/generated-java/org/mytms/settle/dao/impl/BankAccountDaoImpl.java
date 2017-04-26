package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.BankAccountDao;
import org.mytms.settle.domain.BankAccount;
import org.mytms.settle.domain.QBankAccount;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class BankAccountDaoImpl extends GenericEntityDaoImpl<Long, BankAccount> implements BankAccountDao {

    protected final QBankAccount path = QBankAccount.bankAccount;

    public BankAccountDaoImpl() {
        super(QBankAccount.bankAccount);
    }

}

