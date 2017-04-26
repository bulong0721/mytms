package org.mytms.pickup.service.impl;

import org.mytms.pickup.domain.Order;
import org.mytms.pickup.dao.OrderDao;
import org.mytms.pickup.service.OrderService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class OrderServiceImpl extends GenericEntityServiceImpl<Long, Order> implements OrderService {

    protected final OrderDao dao;

    @Autowired
    public OrderServiceImpl(OrderDao dao) {
        super(dao);
        this.dao = dao;
    }

}

