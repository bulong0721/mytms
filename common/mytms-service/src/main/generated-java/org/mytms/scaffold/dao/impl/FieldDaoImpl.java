package org.mytms.scaffold.dao.impl;

import org.mytms.scaffold.dao.FieldDao;
import org.mytms.scaffold.domain.Field;
import org.mytms.scaffold.domain.QField;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class FieldDaoImpl extends GenericEntityDaoImpl<Long, Field> implements FieldDao {

    protected final QField path = QField.field;

    public FieldDaoImpl() {
        super(QField.field);
    }

}

