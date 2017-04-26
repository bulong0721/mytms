package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.InoutLineDao;
import org.mytms.transfer.domain.InoutLine;
import org.mytms.transfer.domain.QInoutLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class InoutLineDaoImpl extends GenericEntityDaoImpl<Long, InoutLine> implements InoutLineDao {

    protected final QInoutLine path = QInoutLine.inoutLine;

    public InoutLineDaoImpl() {
        super(QInoutLine.inoutLine);
    }

}

