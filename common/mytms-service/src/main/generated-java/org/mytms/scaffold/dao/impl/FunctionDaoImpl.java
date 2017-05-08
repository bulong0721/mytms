package org.mytms.scaffold.dao.impl;

import org.mytms.scaffold.dao.FunctionDao;
import org.mytms.scaffold.domain.Function;
import org.mytms.scaffold.domain.QFunction;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class FunctionDaoImpl extends GenericEntityDaoImpl<Long, Function> implements FunctionDao {

    protected final QFunction path = QFunction.function;

    public FunctionDaoImpl() {
        super(QFunction.function);
    }

}

