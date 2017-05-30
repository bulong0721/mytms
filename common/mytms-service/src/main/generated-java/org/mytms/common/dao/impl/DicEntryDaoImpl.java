package org.mytms.common.dao.impl;

import org.mytms.common.dao.DicEntryDao;
import org.mytms.common.domain.DicEntry;
import org.mytms.common.domain.QDicEntry;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class DicEntryDaoImpl extends GenericEntityDaoImpl<Long, DicEntry> implements DicEntryDao {

    protected final QDicEntry path = QDicEntry.dicEntry;

    public DicEntryDaoImpl() {
        super(QDicEntry.dicEntry);
    }

}

