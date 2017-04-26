package org.mytms.pickup.dao.impl;

import org.mytms.pickup.dao.OrderDao;
import org.mytms.pickup.domain.Order;
import org.mytms.pickup.domain.QOrder;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class OrderDaoImpl extends GenericEntityDaoImpl<Long, Order> implements OrderDao {

    protected final QOrder path = QOrder.order;

    public OrderDaoImpl() {
        super(QOrder.order);
    }

}

