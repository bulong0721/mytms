package org.mytms.customer.service.impl;

import org.mytms.customer.domain.Line;
import org.mytms.customer.dao.LineDao;
import org.mytms.customer.service.LineService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class LineServiceImpl extends GenericEntityServiceImpl<Long, Line> implements LineService {

    protected final LineDao dao;

    @Autowired
    public LineServiceImpl(LineDao dao) {
        super(dao);
        this.dao = dao;
    }

}

