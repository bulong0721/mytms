package org.mytms.settle.dao.impl;

import org.mytms.settle.dao.AllocationLineDao;
import org.mytms.settle.domain.AllocationLine;
import org.mytms.settle.domain.QAllocationLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class AllocationLineDaoImpl extends GenericEntityDaoImpl<Long, AllocationLine> implements AllocationLineDao {

    protected final QAllocationLine path = QAllocationLine.allocationLine;

    public AllocationLineDaoImpl() {
        super(QAllocationLine.allocationLine);
    }

}

