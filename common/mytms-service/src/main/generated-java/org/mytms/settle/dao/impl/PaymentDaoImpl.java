package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.PaymentDao;
import org.mytms.settle.domain.Payment;
import org.mytms.settle.domain.QPayment;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class PaymentDaoImpl extends GenericEntityDaoImpl<Long, Payment> implements PaymentDao {

    protected final QPayment path = QPayment.payment;

    public PaymentDaoImpl() {
        super(QPayment.payment);
    }

}

