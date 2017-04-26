package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.PhoneDao;
import org.mytms.profile.domain.Phone;
import org.mytms.profile.domain.QPhone;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class PhoneDaoImpl extends GenericEntityDaoImpl<Long, Phone> implements PhoneDao {

    protected final QPhone path = QPhone.phone;

    public PhoneDaoImpl() {
        super(QPhone.phone);
    }

}

