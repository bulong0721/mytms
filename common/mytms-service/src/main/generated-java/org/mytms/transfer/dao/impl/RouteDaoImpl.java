package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.RouteDao;
import org.mytms.transfer.domain.Route;
import org.mytms.transfer.domain.QRoute;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class RouteDaoImpl extends GenericEntityDaoImpl<Long, Route> implements RouteDao {

    protected final QRoute path = QRoute.route;

    public RouteDaoImpl() {
        super(QRoute.route);
    }

}

