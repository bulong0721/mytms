package org.mytms.profile.service.impl;

import org.mytms.profile.domain.GeoZone;
import org.mytms.profile.dao.GeoZoneDao;
import org.mytms.profile.service.GeoZoneService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class GeoZoneServiceImpl extends GenericEntityServiceImpl<Long, GeoZone> implements GeoZoneService {

    protected final GeoZoneDao dao;

    @Autowired
    public GeoZoneServiceImpl(GeoZoneDao dao) {
        super(dao);
        this.dao = dao;
    }

}

