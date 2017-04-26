package org.mytms.profile.service.impl;

import org.mytms.profile.domain.Role;
import org.mytms.profile.dao.RoleDao;
import org.mytms.profile.service.RoleService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class RoleServiceImpl extends GenericEntityServiceImpl<Long, Role> implements RoleService {

    protected final RoleDao dao;

    @Autowired
    public RoleServiceImpl(RoleDao dao) {
        super(dao);
        this.dao = dao;
    }

}

