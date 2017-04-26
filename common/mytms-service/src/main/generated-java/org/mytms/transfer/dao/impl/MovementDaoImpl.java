package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.MovementDao;
import org.mytms.transfer.domain.Movement;
import org.mytms.transfer.domain.QMovement;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class MovementDaoImpl extends GenericEntityDaoImpl<Long, Movement> implements MovementDao {

    protected final QMovement path = QMovement.movement;

    public MovementDaoImpl() {
        super(QMovement.movement);
    }

}

