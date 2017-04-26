package org.mytms.profile.service.impl;

import org.mytms.profile.domain.Phone;
import org.mytms.profile.dao.PhoneDao;
import org.mytms.profile.service.PhoneService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class PhoneServiceImpl extends GenericEntityServiceImpl<Long, Phone> implements PhoneService {

    protected final PhoneDao dao;

    @Autowired
    public PhoneServiceImpl(PhoneDao dao) {
        super(dao);
        this.dao = dao;
    }

}

