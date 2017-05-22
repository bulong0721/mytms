package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.InsuranceDao;
import org.mytms.customer.domain.Insurance;
import org.mytms.customer.domain.QInsurance;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InsuranceDaoImpl extends GenericEntityDaoImpl<Long, Insurance> implements InsuranceDao {

    protected final QInsurance path = QInsurance.insurance;

    public InsuranceDaoImpl() {
        super(QInsurance.insurance);
    }

}

