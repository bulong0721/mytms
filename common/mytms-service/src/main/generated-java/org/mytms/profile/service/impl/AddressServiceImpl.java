package org.mytms.profile.service.impl;

import org.mytms.profile.domain.Address;
import org.mytms.profile.dao.AddressDao;
import org.mytms.profile.service.AddressService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class AddressServiceImpl extends GenericEntityServiceImpl<Long, Address> implements AddressService {

    protected final AddressDao dao;

    @Autowired
    public AddressServiceImpl(AddressDao dao) {
        super(dao);
        this.dao = dao;
    }

}

