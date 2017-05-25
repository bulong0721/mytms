package org.mytms.web.controller;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.exception.ServiceException;
import org.mytms.customer.domain.Warehouse;
import org.mytms.customer.dto.WarehouseDto;
import org.mytms.customer.service.WarehouseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lello on 2017/5/25.
 */
@Controller
public class WarehouseController {
    private static final Logger LOG = LoggerFactory.getLogger(WarehouseController.class);

    @Autowired
    private WarehouseService warehouseService;

    @ResponseBody
    @RequestMapping({"warehouse/paging"})
    public AjaxPageableResponse pageDriver(@RequestBody WarehouseDto dto) {
        AjaxPageableResponse<WarehouseDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<WarehouseDto> dtoList = Lists.transform(warehouseService.findAll(), entity -> mapper.map(entity, WarehouseDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"warehouse/save"})
    public AjaxResponse saveDriver(@RequestBody WarehouseDto dto) throws ServiceException {
        AjaxResponse<WarehouseDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        warehouseService.update(mapper.map(dto, Warehouse.class));
        return response;
    }
}
