package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.MovementLineDao;
import org.mytms.transfer.domain.MovementLine;
import org.mytms.transfer.domain.QMovementLine;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class MovementLineDaoImpl extends GenericEntityDaoImpl<Long, MovementLine> implements MovementLineDao {

    protected final QMovementLine path = QMovementLine.movementLine;

    public MovementLineDaoImpl() {
        super(QMovementLine.movementLine);
    }

}

