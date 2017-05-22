package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.LineDao;
import org.mytms.customer.domain.Line;
import org.mytms.customer.domain.QLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class LineDaoImpl extends GenericEntityDaoImpl<Long, Line> implements LineDao {

    protected final QLine path = QLine.line;

    public LineDaoImpl() {
        super(QLine.line);
    }

}

