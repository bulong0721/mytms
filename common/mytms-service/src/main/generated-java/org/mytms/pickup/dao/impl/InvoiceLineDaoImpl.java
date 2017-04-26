package org.mytms.pickup.dao.impl;

import org.mytms.pickup.dao.InvoiceLineDao;
import org.mytms.pickup.domain.InvoiceLine;
import org.mytms.pickup.domain.QInvoiceLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InvoiceLineDaoImpl extends GenericEntityDaoImpl<Long, InvoiceLine> implements InvoiceLineDao {

    protected final QInvoiceLine path = QInvoiceLine.invoiceLine;

    public InvoiceLineDaoImpl() {
        super(QInvoiceLine.invoiceLine);
    }

}

