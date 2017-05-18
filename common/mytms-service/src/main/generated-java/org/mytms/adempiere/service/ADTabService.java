package org.mytms.adempiere.service;

import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.dto.TabDto;
import org.mytms.common.service.GenericEntityService;

public interface ADTabService extends GenericEntityService<Long, ADTab> {

    TabDto updateCascade(TabDto dto);
}

