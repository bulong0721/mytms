package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.CustomerPhoneDao;
import org.mytms.customer.domain.CustomerPhone;
import org.mytms.customer.domain.QCustomerPhone;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerPhoneDaoImpl extends GenericEntityDaoImpl<Long, CustomerPhone> implements CustomerPhoneDao {

    protected final QCustomerPhone path = QCustomerPhone.customerPhone;

    public CustomerPhoneDaoImpl() {
        super(QCustomerPhone.customerPhone);
    }

}

