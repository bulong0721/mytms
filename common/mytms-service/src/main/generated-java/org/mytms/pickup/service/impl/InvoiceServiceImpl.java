package org.mytms.pickup.service.impl;

import org.mytms.pickup.domain.Invoice;
import org.mytms.pickup.dao.InvoiceDao;
import org.mytms.pickup.service.InvoiceService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InvoiceServiceImpl extends GenericEntityServiceImpl<Long, Invoice> implements InvoiceService {

    protected final InvoiceDao dao;

    @Autowired
    public InvoiceServiceImpl(InvoiceDao dao) {
        super(dao);
        this.dao = dao;
    }

}

