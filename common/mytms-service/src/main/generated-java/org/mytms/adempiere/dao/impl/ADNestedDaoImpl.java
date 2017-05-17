package org.mytms.adempiere.dao.impl;

import org.mytms.adempiere.dao.ADNestedDao;
import org.mytms.adempiere.domain.ADNested;
import org.mytms.adempiere.domain.QADNested;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ADNestedDaoImpl extends GenericEntityDaoImpl<Long, ADNested> implements ADNestedDao {

    protected final QADNested path = QADNested.aDNested;

    public ADNestedDaoImpl() {
        super(QADNested.aDNested);
    }

}

