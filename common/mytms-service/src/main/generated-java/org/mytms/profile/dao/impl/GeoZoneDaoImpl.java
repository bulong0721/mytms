package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.GeoZoneDao;
import org.mytms.profile.domain.GeoZone;
import org.mytms.profile.domain.QGeoZone;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class GeoZoneDaoImpl extends GenericEntityDaoImpl<Long, GeoZone> implements GeoZoneDao {

    protected final QGeoZone path = QGeoZone.geoZone;

    public GeoZoneDaoImpl() {
        super(QGeoZone.geoZone);
    }

}

