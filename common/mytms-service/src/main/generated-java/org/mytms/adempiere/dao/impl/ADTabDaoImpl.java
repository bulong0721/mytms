package org.mytms.adempiere.dao.impl;

import org.mytms.adempiere.dao.ADTabDao;
import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.domain.QADTab;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ADTabDaoImpl extends GenericEntityDaoImpl<Long, ADTab> implements ADTabDao {

    protected final QADTab path = QADTab.aDTab;

    public ADTabDaoImpl() {
        super(QADTab.aDTab);
    }

}

