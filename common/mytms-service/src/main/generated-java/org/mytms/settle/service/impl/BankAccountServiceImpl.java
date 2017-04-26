package org.mytms.settle.service.impl;

import org.mytms.settle.domain.BankAccount;
import org.mytms.settle.dao.BankAccountDao;
import org.mytms.settle.service.BankAccountService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class BankAccountServiceImpl extends GenericEntityServiceImpl<Long, BankAccount> implements BankAccountService {

    protected final BankAccountDao dao;

    @Autowired
    public BankAccountServiceImpl(BankAccountDao dao) {
        super(dao);
        this.dao = dao;
    }

}

