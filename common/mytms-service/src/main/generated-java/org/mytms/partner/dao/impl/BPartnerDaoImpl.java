package org.mytms.partner.dao.impl;

import org.mytms.partner.dao.BPartnerDao;
import org.mytms.partner.domain.BPartner;
import org.mytms.partner.domain.QBPartner;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class BPartnerDaoImpl extends GenericEntityDaoImpl<Long, BPartner> implements BPartnerDao {

    protected final QBPartner path = QBPartner.bPartner;

    public BPartnerDaoImpl() {
        super(QBPartner.bPartner);
    }

}

