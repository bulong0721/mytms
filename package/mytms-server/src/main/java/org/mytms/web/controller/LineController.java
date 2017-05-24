package org.mytms.web.controller;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.exception.ServiceException;
import org.mytms.customer.domain.Driver;
import org.mytms.customer.domain.Line;
import org.mytms.customer.dto.DriverDto;
import org.mytms.customer.dto.LineDto;
import org.mytms.customer.service.DriverService;
import org.mytms.customer.service.LineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lello on 2017/5/24.
 */
@Controller
public class LineController {
    private static final Logger LOG = LoggerFactory.getLogger(LineController.class);

    @Autowired
    private LineService lineService;

    @ResponseBody
    @RequestMapping({"line/paging"})
    public AjaxPageableResponse pageDriver(@RequestBody LineDto dto) {
        AjaxPageableResponse<LineDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<LineDto> dtoList = Lists.transform(lineService.findAll(), entity -> mapper.map(entity, LineDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"line/save"})
    public AjaxResponse saveDriver(@RequestBody LineDto dto) throws ServiceException {
        AjaxResponse<LineDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        lineService.update(mapper.map(dto, Line.class));
        return response;
    }
}
