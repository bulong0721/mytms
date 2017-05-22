package org.mytms.customer.service.impl;

import com.querydsl.core.types.Predicate;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.customer.domain.CustomerGroup;
import org.mytms.customer.dao.CustomerGroupDao;
import org.mytms.customer.dto.CustomerGroupDto;
import org.mytms.customer.service.CustomerGroupService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class CustomerGroupServiceImpl extends GenericEntityServiceImpl<Long, CustomerGroup> implements CustomerGroupService {

    protected final CustomerGroupDao dao;

    @Autowired
    public CustomerGroupServiceImpl(CustomerGroupDao dao) {
        super(dao);
        this.dao = dao;
    }

    public Page<CustomerGroup> listGroup(CustomerGroupDto dto) {
        return null;
    }
}

