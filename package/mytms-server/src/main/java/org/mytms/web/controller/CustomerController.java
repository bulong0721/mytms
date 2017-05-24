package org.mytms.web.controller;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.ajax.AjaxResponse;
import org.mytms.common.exception.ServiceException;
import org.mytms.customer.domain.CustomerGroup;
import org.mytms.customer.domain.Vehicle;
import org.mytms.customer.dto.CustomerGroupDto;
import org.mytms.customer.dto.VehicleDto;
import org.mytms.customer.service.CustomerGroupService;
import org.mytms.customer.service.VehicleService;
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
public class CustomerController {
    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerGroupService groupService;

    @Autowired
    private VehicleService vehicleService;

    @ResponseBody
    @RequestMapping({"customerGroup/paging"})
    public AjaxPageableResponse pageCustomerGroup(@RequestBody CustomerGroupDto dto) {
        AjaxPageableResponse<CustomerGroupDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<CustomerGroupDto> dtoList = Lists.transform(groupService.findAll(), entity -> mapper.map(entity, CustomerGroupDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"customerGroup/save"})
    public AjaxResponse saveCustomerGroup(@RequestBody CustomerGroupDto dto) throws ServiceException {
        AjaxResponse<CustomerGroupDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        groupService.update(mapper.map(dto, CustomerGroup.class));
        return response;
    }

    @ResponseBody
    @RequestMapping({"customerGroup/delete"})
    public AjaxResponse deleteCustomerGroup(@RequestBody CustomerGroupDto dto) {
        AjaxResponse<CustomerGroupDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        return response;
    }

    @ResponseBody
    @RequestMapping({"vehicle/paging"})
    public AjaxPageableResponse pageVehicle(@RequestBody VehicleDto dto) {
        AjaxPageableResponse<VehicleDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        List<VehicleDto> dtoList = Lists.transform(vehicleService.findAll(), entity -> mapper.map(entity, VehicleDto.class));
        response.setList(dtoList);
        return response;
    }

    @ResponseBody
    @RequestMapping({"vehicle/save"})
    public AjaxResponse saveVehicle(@RequestBody VehicleDto dto) throws ServiceException {
        AjaxResponse<VehicleDto> response = new AjaxResponse<>();
        ModelMapper mapper = new ModelMapper();
        vehicleService.update(mapper.map(dto, Vehicle.class));
        return response;
    }

    @ResponseBody
    @RequestMapping({"vehicle/delete"})
    public AjaxResponse deleteVehicle(@RequestBody VehicleDto dto) {
        AjaxResponse<VehicleDto> response = new AjaxPageableResponse<>();
        ModelMapper mapper = new ModelMapper();
        return response;
    }
}
