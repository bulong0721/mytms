package org.mytms.pickup.service.impl;

import org.mytms.pickup.domain.InvoiceLine;
import org.mytms.pickup.dao.InvoiceLineDao;
import org.mytms.pickup.service.InvoiceLineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InvoiceLineServiceImpl extends GenericEntityServiceImpl<Long, InvoiceLine> implements InvoiceLineService {

    protected final InvoiceLineDao dao;

    @Autowired
    public InvoiceLineServiceImpl(InvoiceLineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

