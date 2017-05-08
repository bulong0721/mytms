package org.mytms.scaffold.service.impl;

import org.mytms.scaffold.domain.Form;
import org.mytms.scaffold.dao.FormDao;
import org.mytms.scaffold.service.FormService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class FormServiceImpl extends GenericEntityServiceImpl<Long, Form> implements FormService {

    protected final FormDao dao;

    @Autowired
    public FormServiceImpl(FormDao dao) {
        super(dao);
        this.dao = dao;
    }

}

