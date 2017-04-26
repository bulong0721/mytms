package org.mytms.settle.service.impl;

import org.mytms.settle.domain.PaymentBatch;
import org.mytms.settle.dao.PaymentBatchDao;
import org.mytms.settle.service.PaymentBatchService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class PaymentBatchServiceImpl extends GenericEntityServiceImpl<Long, PaymentBatch> implements PaymentBatchService {

    protected final PaymentBatchDao dao;

    @Autowired
    public PaymentBatchServiceImpl(PaymentBatchDao dao) {
        super(dao);
        this.dao = dao;
    }

}

