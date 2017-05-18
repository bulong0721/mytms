package org.mytms.adempiere.service.impl;

import org.modelmapper.ModelMapper;
import org.mytms.adempiere.dao.ADActionDao;
import org.mytms.adempiere.dao.ADFieldDao;
import org.mytms.adempiere.dao.ADNestedDao;
import org.mytms.adempiere.dao.ADTabDao;
import org.mytms.adempiere.domain.ADAction;
import org.mytms.adempiere.domain.ADField;
import org.mytms.adempiere.domain.ADNested;
import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.dto.TabDto;
import org.mytms.adempiere.service.ADTabService;
import org.mytms.common.service.GenericEntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ADTabServiceImpl extends GenericEntityServiceImpl<Long, ADTab> implements ADTabService {

    protected final ADTabDao dao;

    @Autowired
    private ADFieldDao fieldDao;

    @Autowired
    private ADActionDao actionDao;

    @Autowired
    private ADNestedDao nestedDao;

    @Autowired
    public ADTabServiceImpl(ADTabDao dao) {
        super(dao);
        this.dao = dao;
    }

    public TabDto updateCascade(TabDto dto) {
        ADTab entity = convertToEntity(dto);
        ADTab persistedEntity = dao.save(entity);
        if (null != entity.getActions()) {
            for (ADAction action : entity.getActions()) {
                action.setTab(persistedEntity);
            }
            List<ADAction> actions = actionDao.save(entity.getActions());
            persistedEntity.setActions(actions);
        }
        if (null != entity.getFields()) {
            for (ADField field : entity.getFields()) {
                field.setTab(persistedEntity);
            }
            List<ADField> fields = fieldDao.save(entity.getFields());
            persistedEntity.setFields(fields);
        }
        if (null != entity.getNesteds()) {
            for (ADNested nested : entity.getNesteds()) {
                nested.setTab(persistedEntity);
            }
            List<ADNested> nesteds = nestedDao.save(entity.getNesteds());
            persistedEntity.setNesteds(nesteds);
        }
        return convertToDto(persistedEntity);
    }

    TabDto convertToDto(ADTab entity) {
        return new ModelMapper().map(entity, TabDto.class);
    }

    ADTab convertToEntity(TabDto dto) {
        return new ModelMapper().map(dto, ADTab.class);
    }

}

