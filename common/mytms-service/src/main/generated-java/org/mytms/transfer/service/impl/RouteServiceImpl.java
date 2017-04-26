package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.Route;
import org.mytms.transfer.dao.RouteDao;
import org.mytms.transfer.service.RouteService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class RouteServiceImpl extends GenericEntityServiceImpl<Long, Route> implements RouteService {

    protected final RouteDao dao;

    @Autowired
    public RouteServiceImpl(RouteDao dao) {
        super(dao);
        this.dao = dao;
    }

}

