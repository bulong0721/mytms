package org.mytms.customer.dao.impl;

import com.querydsl.core.types.Predicate;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.customer.dao.CustomerGroupDao;
import org.mytms.customer.domain.CustomerGroup;
import org.mytms.customer.domain.QCustomerGroup;

import org.mytms.customer.dto.CustomerGroupDto;
import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class CustomerGroupDaoImpl extends GenericEntityDaoImpl<Long, CustomerGroup> implements CustomerGroupDao {

    protected final QCustomerGroup path = QCustomerGroup.customerGroup;

    public CustomerGroupDaoImpl() {
        super(QCustomerGroup.customerGroup);
    }

    @Override
    public Page<CustomerGroup> pageGroup(CustomerGroupDto dto) {
        Predicate predicate = null;
//        if (null != dto.getIndustryType()) {
//            predicate = path.industryType.eq(dto.getGroupType());
//        }
//        if (null != dto.getGroupType()) {
//            path.groupType.eq(dto.getGroupType());
//        }
        if(null != dto.getCompany()) {
            path.company.like(dto.getCompany());
        }
        return null;
    }
}

