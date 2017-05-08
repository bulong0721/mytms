package org.mytms.scaffold.service.impl;

import org.mytms.scaffold.domain.Operator;
import org.mytms.scaffold.dao.OperatorDao;
import org.mytms.scaffold.service.OperatorService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class OperatorServiceImpl extends GenericEntityServiceImpl<Long, Operator> implements OperatorService {

    protected final OperatorDao dao;

    @Autowired
    public OperatorServiceImpl(OperatorDao dao) {
        super(dao);
        this.dao = dao;
    }

}

