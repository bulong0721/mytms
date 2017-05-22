package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.DriverDao;
import org.mytms.customer.domain.Driver;
import org.mytms.customer.domain.QDriver;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class DriverDaoImpl extends GenericEntityDaoImpl<Long, Driver> implements DriverDao {

    protected final QDriver path = QDriver.driver;

    public DriverDaoImpl() {
        super(QDriver.driver);
    }

}

