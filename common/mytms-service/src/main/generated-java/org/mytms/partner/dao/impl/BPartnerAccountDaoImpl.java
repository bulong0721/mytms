package org.mytms.partner.dao.impl;

import org.mytms.partner.dao.BPartnerAccountDao;
import org.mytms.partner.domain.BPartnerAccount;
import org.mytms.partner.domain.QBPartnerAccount;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class BPartnerAccountDaoImpl extends GenericEntityDaoImpl<Long, BPartnerAccount> implements BPartnerAccountDao {

    protected final QBPartnerAccount path = QBPartnerAccount.bPartnerAccount;

    public BPartnerAccountDaoImpl() {
        super(QBPartnerAccount.bPartnerAccount);
    }

}

