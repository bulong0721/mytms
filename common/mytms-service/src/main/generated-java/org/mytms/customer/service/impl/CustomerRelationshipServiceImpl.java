package org.mytms.customer.service.impl;

import org.mytms.customer.domain.CustomerRelationship;
import org.mytms.customer.dao.CustomerRelationshipDao;
import org.mytms.customer.service.CustomerRelationshipService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerRelationshipServiceImpl extends GenericEntityServiceImpl<Long, CustomerRelationship> implements CustomerRelationshipService {

    protected final CustomerRelationshipDao dao;

    @Autowired
    public CustomerRelationshipServiceImpl(CustomerRelationshipDao dao) {
        super(dao);
        this.dao = dao;
    }

}

