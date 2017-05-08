package org.mytms.scaffold.service.impl;

import org.mytms.scaffold.domain.Function;
import org.mytms.scaffold.dao.FunctionDao;
import org.mytms.scaffold.service.FunctionService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class FunctionServiceImpl extends GenericEntityServiceImpl<Long, Function> implements FunctionService {

    protected final FunctionDao dao;

    @Autowired
    public FunctionServiceImpl(FunctionDao dao) {
        super(dao);
        this.dao = dao;
    }

}

