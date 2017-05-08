package org.mytms.scaffold.dao.impl;

import org.mytms.scaffold.dao.OperatorDao;
import org.mytms.scaffold.domain.Operator;
import org.mytms.scaffold.domain.QOperator;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class OperatorDaoImpl extends GenericEntityDaoImpl<Long, Operator> implements OperatorDao {

    protected final QOperator path = QOperator.operator;

    public OperatorDaoImpl() {
        super(QOperator.operator);
    }

}

