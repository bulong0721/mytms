package org.mytms.web.controller;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.series.Line;
import com.google.common.collect.Lists;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.domain.Client;
import org.mytms.common.exception.ServiceException;
import org.mytms.common.service.ClientService;
import org.mytms.scaffold.domain.DbTable;
import org.mytms.scaffold.service.DbTableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Martin on 2017/3/16.
 */
@Controller
public class ToolController {
    private static final Logger LOG = LoggerFactory.getLogger(ToolController.class);

    @Autowired
    private DbTableService tableService;

    @ResponseBody
    @RequestMapping("/table/paging")
    public AjaxResponse listTable(@RequestBody String body) {
        List<DbTable> all = tableService.findAll();
        AjaxPageableResponse<DbTable> response = new AjaxPageableResponse<>();
        response.setList(all);
        return response;
    }

    @ResponseBody
    @RequestMapping("/table/save")
    public AjaxResponse saveTable(@RequestBody DbTable table) {
        AjaxResponse<Client> response = new AjaxResponse<>();
        try {
            tableService.update(table);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return response;
    }
}
