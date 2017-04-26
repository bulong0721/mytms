package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.RoleDao;
import org.mytms.profile.domain.Role;
import org.mytms.profile.domain.QRole;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class RoleDaoImpl extends GenericEntityDaoImpl<Long, Role> implements RoleDao {

    protected final QRole path = QRole.role;

    public RoleDaoImpl() {
        super(QRole.role);
    }

}

