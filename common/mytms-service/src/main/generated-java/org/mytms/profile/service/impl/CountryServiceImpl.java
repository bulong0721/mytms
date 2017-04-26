package org.mytms.profile.service.impl;

import org.mytms.profile.domain.Country;
import org.mytms.profile.dao.CountryDao;
import org.mytms.profile.service.CountryService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CountryServiceImpl extends GenericEntityServiceImpl<Long, Country> implements CountryService {

    protected final CountryDao dao;

    @Autowired
    public CountryServiceImpl(CountryDao dao) {
        super(dao);
        this.dao = dao;
    }

}

