package org.mytms.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.modelmapper.ModelMapper;
import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.dto.FieldDto;
import org.mytms.adempiere.dto.TabDto;
import org.mytms.adempiere.service.ADMetaService;
import org.mytms.adempiere.service.ADTabService;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.domain.DicEntry;
import org.mytms.common.dto.EntryDto;
import org.mytms.common.service.DicEntryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 2017/3/16.
 */
@Controller
public class ToolController {
    private static final Logger LOG = LoggerFactory.getLogger(ToolController.class);

    @Autowired
    ADMetaService metaService;
    @Autowired
    ADTabService tabService;

    @ResponseBody
    @RequestMapping("/tab/listFieldsByTable")
    public AjaxPageableResponse listFields(@RequestBody JSONObject parameter) {
        AjaxPageableResponse<FieldDto> response = new AjaxPageableResponse<>();
        String tableName = parameter.getString("tableName");
        List<FieldDto> all = metaService.listFieldsByTable(tableName);
        response.setList(all);
        return response;
    }

    @ResponseBody
    @RequestMapping({"/tab/listTabs", "/tab/paging"})
    public AjaxPageableResponse listTabs(@RequestBody JSONObject parameter) {
        AjaxPageableResponse<TabDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<TabDto> dtoList = Lists.transform(tabService.findAll(), entity -> mapper.map(entity, TabDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping("/tab/saveSchema")
    public AjaxResponse saveSchema(@RequestBody TabDto tabDto) {
        AjaxResponse<TabDto> response = new AjaxResponse<>();
        TabDto savedDto = tabService.updateCascade(tabDto);
        response.setData(savedDto);
        return response;
    }

    @Autowired
    private DicEntryService entryService;

    @ResponseBody
    @RequestMapping("/entry/dictionary")
    public AjaxPageableResponse getDictionary() {
        AjaxPageableResponse<EntryDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<EntryDto> entries = Lists.transform(entryService.findAll(), entity -> mapper.map(entity, EntryDto.class));
        response.setList(entries);
        return response;
    }

}
