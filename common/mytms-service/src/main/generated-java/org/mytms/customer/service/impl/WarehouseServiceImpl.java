package org.mytms.customer.service.impl;

import org.mytms.common.exception.ServiceException;
import org.mytms.customer.dao.InsuranceDao;
import org.mytms.customer.domain.Insurance;
import org.mytms.customer.domain.Warehouse;
import org.mytms.customer.dao.WarehouseDao;
import org.mytms.customer.service.WarehouseService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class WarehouseServiceImpl extends GenericEntityServiceImpl<Long, Warehouse> implements WarehouseService {

    protected final WarehouseDao dao;

    @Autowired
    private InsuranceDao insuranceDao;

    @Autowired
    public WarehouseServiceImpl(WarehouseDao dao) {
        super(dao);
        this.dao = dao;
    }

    @Override
    public <S extends Warehouse> S update(S entity) throws ServiceException {
        S pEntity = super.update(entity);
        if (null != entity.getInsurances()) {
            for (Insurance insurance : entity.getInsurances()) {
                insurance.setWarehouse(pEntity);
                insuranceDao.save(insurance);
            }
        }
        return pEntity;
    }

}

