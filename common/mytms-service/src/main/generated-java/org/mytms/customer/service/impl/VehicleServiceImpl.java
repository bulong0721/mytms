package org.mytms.customer.service.impl;

import org.mytms.common.exception.ServiceException;
import org.mytms.common.service.GenericEntityServiceImpl;
import org.mytms.customer.dao.InsuranceDao;
import org.mytms.customer.dao.VehicleDao;
import org.mytms.customer.domain.Insurance;
import org.mytms.customer.domain.Vehicle;
import org.mytms.customer.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends GenericEntityServiceImpl<Long, Vehicle> implements VehicleService {

    protected final VehicleDao dao;

    @Autowired
    private InsuranceDao insuranceDao;

    @Autowired
    public VehicleServiceImpl(VehicleDao dao) {
        super(dao);
        this.dao = dao;
    }

    @Override
    public <S extends Vehicle> S update(S entity) throws ServiceException {
        S pEntity = super.update(entity);
        if (null != entity.getInsurances()) {
            for (Insurance insurance : entity.getInsurances()) {
                insurance.setVehicle(pEntity);
                insuranceDao.save(insurance);
            }
        }
        return pEntity;
    }
}