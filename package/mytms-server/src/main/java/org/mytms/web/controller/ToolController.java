package org.mytms.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.mytms.adempiere.domain.ADTab;
import org.mytms.adempiere.dto.FieldDto;
import org.mytms.adempiere.dto.TabDto;
import org.mytms.adempiere.service.ADTabService;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.mysql.service.MetaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Martin on 2017/3/16.
 */
@Controller
public class ToolController {
    private static final Logger LOG = LoggerFactory.getLogger(ToolController.class);

    @Autowired
    MetaService metaService;
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
    @RequestMapping("/tab/listTabs")
    public AjaxPageableResponse listTabs(@RequestBody JSONObject parameter) {
        AjaxPageableResponse<TabDto> response = new AjaxPageableResponse<>();

        return response;
    }

    @ResponseBody
    @RequestMapping("/tab/saveSchema")
    public AjaxResponse saveSchema(@RequestBody TabDto tabDto) {
        AjaxResponse<TabDto> response = new AjaxResponse<>();
        LOG.info("schema", tabDto);
        return response;
    }

    ADTab toEntity(TabDto tabDto) {
        ADTab entity = new ADTab();
        return entity;
    }
}
