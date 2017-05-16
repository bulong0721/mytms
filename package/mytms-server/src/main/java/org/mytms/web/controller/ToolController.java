package org.mytms.web.controller;

import org.mytms.adempiere.dto.FieldDto;
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

    @ResponseBody
    @RequestMapping("/tab/listFieldsByTable")
    public AjaxResponse listFields() {
        AjaxPageableResponse<FieldDto> response = new AjaxPageableResponse<>();
        List<FieldDto> all = metaService.listFieldsByTable("crm_vehicle");
        response.setList(all);
        return response;
    }
}
