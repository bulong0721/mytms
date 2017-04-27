package org.mytms.web.controller;

import org.mytms.common.ajax.AjaxPageableResponse;
import org.mytms.common.domain.Client;
import org.mytms.common.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Martin on 2017/3/16.
 */
@Controller
public class ClientController {
    private static final Logger LOG = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping("/user/paging")
    public AjaxPageableResponse listUser() {
        List<Client> all = clientService.findAll();
        AjaxPageableResponse<Client> response = new AjaxPageableResponse<>();
        response.setList(all);
        return response;
    }

}
