package org.mytms.partner.service.impl;

import org.mytms.partner.domain.BPartner;
import org.mytms.partner.dao.BPartnerDao;
import org.mytms.partner.service.BPartnerService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class BPartnerServiceImpl extends GenericEntityServiceImpl<Long, BPartner> implements BPartnerService {

    protected final BPartnerDao dao;

    @Autowired
    public BPartnerServiceImpl(BPartnerDao dao) {
        super(dao);
        this.dao = dao;
    }

}

