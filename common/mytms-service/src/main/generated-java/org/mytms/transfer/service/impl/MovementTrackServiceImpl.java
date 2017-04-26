package org.mytms.transfer.service.impl;

import org.mytms.transfer.domain.MovementTrack;
import org.mytms.transfer.dao.MovementTrackDao;
import org.mytms.transfer.service.MovementTrackService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class MovementTrackServiceImpl extends GenericEntityServiceImpl<Long, MovementTrack> implements MovementTrackService {

    protected final MovementTrackDao dao;

    @Autowired
    public MovementTrackServiceImpl(MovementTrackDao dao) {
        super(dao);
        this.dao = dao;
    }

}

