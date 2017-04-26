package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.CountryDao;
import org.mytms.profile.domain.Country;
import org.mytms.profile.domain.QCountry;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CountryDaoImpl extends GenericEntityDaoImpl<Long, Country> implements CountryDao {

    protected final QCountry path = QCountry.country;

    public CountryDaoImpl() {
        super(QCountry.country);
    }

}

