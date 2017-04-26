package org.mytms.common.dao.impl;

import org.mytms.common.dao.ClientDao;
import org.mytms.common.domain.Client;
import org.mytms.common.domain.QClient;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ClientDaoImpl extends GenericEntityDaoImpl<Long, Client> implements ClientDao {

    protected final QClient path = QClient.client;

    public ClientDaoImpl() {
        super(QClient.client);
    }

}

