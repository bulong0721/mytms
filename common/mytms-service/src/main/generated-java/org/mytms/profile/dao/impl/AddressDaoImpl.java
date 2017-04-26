package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.AddressDao;
import org.mytms.profile.domain.Address;
import org.mytms.profile.domain.QAddress;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class AddressDaoImpl extends GenericEntityDaoImpl<Long, Address> implements AddressDao {

    protected final QAddress path = QAddress.address;

    public AddressDaoImpl() {
        super(QAddress.address);
    }

}

