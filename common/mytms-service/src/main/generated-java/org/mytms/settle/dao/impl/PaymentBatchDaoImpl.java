package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.PaymentBatchDao;
import org.mytms.settle.domain.PaymentBatch;
import org.mytms.settle.domain.QPaymentBatch;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class PaymentBatchDaoImpl extends GenericEntityDaoImpl<Long, PaymentBatch> implements PaymentBatchDao {

    protected final QPaymentBatch path = QPaymentBatch.paymentBatch;

    public PaymentBatchDaoImpl() {
        super(QPaymentBatch.paymentBatch);
    }

}

