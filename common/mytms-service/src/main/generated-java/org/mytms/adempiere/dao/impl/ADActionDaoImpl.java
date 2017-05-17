package org.mytms.adempiere.dao.impl;

import org.mytms.adempiere.dao.ADActionDao;
import org.mytms.adempiere.domain.ADAction;
import org.mytms.adempiere.domain.QADAction;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ADActionDaoImpl extends GenericEntityDaoImpl<Long, ADAction> implements ADActionDao {

    protected final QADAction path = QADAction.aDAction;

    public ADActionDaoImpl() {
        super(QADAction.aDAction);
    }

}

