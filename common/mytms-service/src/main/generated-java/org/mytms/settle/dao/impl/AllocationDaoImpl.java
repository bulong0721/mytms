package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.AllocationDao;
import org.mytms.settle.domain.Allocation;
import org.mytms.settle.domain.QAllocation;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class AllocationDaoImpl extends GenericEntityDaoImpl<Long, Allocation> implements AllocationDao {

    protected final QAllocation path = QAllocation.allocation;

    public AllocationDaoImpl() {
        super(QAllocation.allocation);
    }

}

