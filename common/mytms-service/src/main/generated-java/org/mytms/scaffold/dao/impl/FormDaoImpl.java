package org.mytms.scaffold.dao.impl;

import org.mytms.scaffold.dao.FormDao;
import org.mytms.scaffold.domain.Form;
import org.mytms.scaffold.domain.QForm;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class FormDaoImpl extends GenericEntityDaoImpl<Long, Form> implements FormDao {

    protected final QForm path = QForm.form;

    public FormDaoImpl() {
        super(QForm.form);
    }

}

