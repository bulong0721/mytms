package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Insurance;
import org.mytms.customer.dao.InsuranceDao;
import org.mytms.customer.service.InsuranceService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class InsuranceServiceImpl extends GenericEntityServiceImpl<Long, Insurance> implements InsuranceService {

    protected final InsuranceDao dao;

    @Autowired
    public InsuranceServiceImpl(InsuranceDao dao) {
        super(dao);
        this.dao = dao;
    }

}

