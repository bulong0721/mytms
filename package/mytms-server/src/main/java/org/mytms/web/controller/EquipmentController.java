package org.mytms.web.controller;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.exception.ServiceException;
import org.mytms.customer.domain.Equipment;
import org.mytms.customer.dto.EquipmentDto;
import org.mytms.customer.service.EquipmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lello on 2017/5/22.
 */
@Controller
public class EquipmentController {
    private static final Logger LOG = LoggerFactory.getLogger(EquipmentController.class);

    @Autowired
    private EquipmentService equipmentService;

    @ResponseBody
    @RequestMapping({"equipment/paging"})
    public AjaxPageableResponse pageCustomerGroup(@RequestBody EquipmentDto dto) {
        AjaxPageableResponse<EquipmentDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<EquipmentDto> dtoList = Lists.transform(equipmentService.findAll(), entity -> mapper.map(entity, EquipmentDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"equipment/save"})
    public AjaxResponse saveCustomerGroup(@RequestBody EquipmentDto dto) throws ServiceException {
        AjaxResponse<EquipmentDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        equipmentService.update(mapper.map(dto, Equipment.class));
        return response;
    }
}
