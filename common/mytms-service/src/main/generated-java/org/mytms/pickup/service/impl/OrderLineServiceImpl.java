package org.mytms.pickup.service.impl;

import org.mytms.pickup.domain.OrderLine;
import org.mytms.pickup.dao.OrderLineDao;
import org.mytms.pickup.service.OrderLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class OrderLineServiceImpl extends GenericEntityServiceImpl<Long, OrderLine> implements OrderLineService {

    protected final OrderLineDao dao;

    @Autowired
    public OrderLineServiceImpl(OrderLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

