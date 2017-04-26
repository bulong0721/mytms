package org.mytms.pickup.dao.impl;

import org.mytms.pickup.dao.OrderLineDao;
import org.mytms.pickup.domain.OrderLine;
import org.mytms.pickup.domain.QOrderLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class OrderLineDaoImpl extends GenericEntityDaoImpl<Long, OrderLine> implements OrderLineDao {

    protected final QOrderLine path = QOrderLine.orderLine;

    public OrderLineDaoImpl() {
        super(QOrderLine.orderLine);
    }

}

