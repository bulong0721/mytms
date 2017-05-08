package org.mytms.scaffold.service.impl;

import org.mytms.scaffold.domain.Field;
import org.mytms.scaffold.dao.FieldDao;
import org.mytms.scaffold.service.FieldService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class FieldServiceImpl extends GenericEntityServiceImpl<Long, Field> implements FieldService {

    protected final FieldDao dao;

    @Autowired
    public FieldServiceImpl(FieldDao dao) {
        super(dao);
        this.dao = dao;
    }

}

