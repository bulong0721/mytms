package org.mytms.settle.service.impl;

import org.mytms.settle.domain.Bank;
import org.mytms.settle.dao.BankDao;
import org.mytms.settle.service.BankService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class BankServiceImpl extends GenericEntityServiceImpl<Long, Bank> implements BankService {

    protected final BankDao dao;

    @Autowired
    public BankServiceImpl(BankDao dao) {
        super(dao);
        this.dao = dao;
    }

}

