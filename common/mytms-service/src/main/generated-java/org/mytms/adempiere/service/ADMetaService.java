package org.mytms.adempiere.service;

import org.mytms.adempiere.dto.FieldDto;

import java.util.List;

/**
 * Created by Martin.Xu on 2017/5/15.
 */
public interface ADMetaService {

    List<FieldDto> listFieldsByTable(String table);
}
