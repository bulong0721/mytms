package org.mytms.settle.service.impl;

import org.mytms.settle.domain.Payment;
import org.mytms.settle.dao.PaymentDao;
import org.mytms.settle.service.PaymentService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class PaymentServiceImpl extends GenericEntityServiceImpl<Long, Payment> implements PaymentService {

    protected final PaymentDao dao;

    @Autowired
    public PaymentServiceImpl(PaymentDao dao) {
        super(dao);
        this.dao = dao;
    }

}

