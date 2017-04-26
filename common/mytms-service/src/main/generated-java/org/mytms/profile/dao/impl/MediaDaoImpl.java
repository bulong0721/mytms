package org.mytms.profile.dao.impl;

import org.mytms.profile.dao.MediaDao;
import org.mytms.profile.domain.Media;
import org.mytms.profile.domain.QMedia;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class MediaDaoImpl extends GenericEntityDaoImpl<Long, Media> implements MediaDao {

    protected final QMedia path = QMedia.media;

    public MediaDaoImpl() {
        super(QMedia.media);
    }

}

