package org.mytms.pickup.dao.impl;

import org.mytms.pickup.dao.InvoiceDao;
import org.mytms.pickup.domain.Invoice;
import org.mytms.pickup.domain.QInvoice;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InvoiceDaoImpl extends GenericEntityDaoImpl<Long, Invoice> implements InvoiceDao {

    protected final QInvoice path = QInvoice.invoice;

    public InvoiceDaoImpl() {
        super(QInvoice.invoice);
    }

}

