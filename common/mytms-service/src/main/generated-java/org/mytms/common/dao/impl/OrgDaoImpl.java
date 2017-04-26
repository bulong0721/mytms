package org.mytms.common.dao.impl;

import org.mytms.common.dao.OrgDao;
import org.mytms.common.domain.Org;
import org.mytms.common.domain.QOrg;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class OrgDaoImpl extends GenericEntityDaoImpl<Long, Org> implements OrgDao {

    protected final QOrg path = QOrg.org;

    public OrgDaoImpl() {
        super(QOrg.org);
    }

}

