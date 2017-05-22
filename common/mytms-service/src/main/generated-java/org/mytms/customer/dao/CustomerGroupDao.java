package org.mytms.customer.dao;

import org.mytms.common.data.Page;
import org.mytms.customer.domain.CustomerGroup;

import org.mytms.common.dao.GenericEntityDao;
import org.mytms.customer.dto.CustomerGroupDto;

public interface CustomerGroupDao extends GenericEntityDao<Long, CustomerGroup> {

    Page<CustomerGroup> pageGroup(CustomerGroupDto dto);
}

