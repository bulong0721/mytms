package org.mytms.partner.service.impl;

import org.mytms.partner.domain.BPartnerAccount;
import org.mytms.partner.dao.BPartnerAccountDao;
import org.mytms.partner.service.BPartnerAccountService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class BPartnerAccountServiceImpl extends GenericEntityServiceImpl<Long, BPartnerAccount> implements BPartnerAccountService {

    protected final BPartnerAccountDao dao;

    @Autowired
    public BPartnerAccountServiceImpl(BPartnerAccountDao dao) {
        super(dao);
        this.dao = dao;
    }

}

