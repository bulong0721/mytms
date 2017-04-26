package org.mytms.common.service.impl;

import org.mytms.common.domain.Client;
import org.mytms.common.dao.ClientDao;
import org.mytms.common.service.ClientService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ClientServiceImpl extends GenericEntityServiceImpl<Long, Client> implements ClientService {

    protected final ClientDao dao;

    @Autowired
    public ClientServiceImpl(ClientDao dao) {
        super(dao);
        this.dao = dao;
    }

}

