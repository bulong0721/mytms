package org.mytms.transfer.dao.impl;

import org.mytms.transfer.dao.MovementTrackDao;
import org.mytms.transfer.domain.MovementTrack;
import org.mytms.transfer.domain.QMovementTrack;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class MovementTrackDaoImpl extends GenericEntityDaoImpl<Long, MovementTrack> implements MovementTrackDao {

    protected final QMovementTrack path = QMovementTrack.movementTrack;

    public MovementTrackDaoImpl() {
        super(QMovementTrack.movementTrack);
    }

}

