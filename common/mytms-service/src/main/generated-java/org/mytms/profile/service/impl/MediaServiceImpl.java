package org.mytms.profile.service.impl;

import org.mytms.profile.domain.Media;
import org.mytms.profile.dao.MediaDao;
import org.mytms.profile.service.MediaService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class MediaServiceImpl extends GenericEntityServiceImpl<Long, Media> implements MediaService {

    protected final MediaDao dao;

    @Autowired
    public MediaServiceImpl(MediaDao dao) {
        super(dao);
        this.dao = dao;
    }

}

