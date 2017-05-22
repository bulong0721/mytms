package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerRelationshipDao;
import org.mytms.customer.domain.CustomerRelationship;
import org.mytms.customer.domain.QCustomerRelationship;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerRelationshipDaoImpl extends GenericEntityDaoImpl<Long, CustomerRelationship> implements CustomerRelationshipDao {

    protected final QCustomerRelationship path = QCustomerRelationship.customerRelationship;

    public CustomerRelationshipDaoImpl() {
        super(QCustomerRelationship.customerRelationship);
    }

}

