package org.mytms.adempiere.dao.impl;

import org.mytms.adempiere.dao.ADFieldDao;
import org.mytms.adempiere.domain.ADField;
import org.mytms.adempiere.domain.QADField;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ADFieldDaoImpl extends GenericEntityDaoImpl<Long, ADField> implements ADFieldDao {

    protected final QADField path = QADField.aDField;

    public ADFieldDaoImpl() {
        super(QADField.aDField);
    }

}

