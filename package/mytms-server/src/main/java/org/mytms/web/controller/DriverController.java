package org.mytms.web.controller;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.exception.ServiceException;
import org.mytms.customer.domain.Driver;
import org.mytms.customer.dto.DriverDto;
import org.mytms.customer.service.DriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lello on 2017/5/23.
 */
@Controller
public class DriverController {
    private static final Logger LOG = LoggerFactory.getLogger(DriverController.class);

    @Autowired
    private DriverService driverService;

    @ResponseBody
    @RequestMapping({"driver/paging"})
    public AjaxPageableResponse pageDriver(@RequestBody DriverDto dto) {
        AjaxPageableResponse<DriverDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<DriverDto> dtoList = Lists.transform(driverService.findAll(), entity -> mapper.map(entity, DriverDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"driver/save"})
    public AjaxResponse saveDriver(@RequestBody DriverDto dto) throws ServiceException {
        AjaxResponse<DriverDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        driverService.update(mapper.map(dto, Driver.class));
        return response;
    }
}
