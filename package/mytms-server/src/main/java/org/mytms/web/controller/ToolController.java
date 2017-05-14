package org.mytms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * Created by Martin on 2017/3/16.
 */
@Controller
public class ToolController {
    private static final Logger LOG = LoggerFactory.getLogger(ToolController.class);

//    @Autowired
//    private DbTableService tableService;
//
//    @ResponseBody
//    @RequestMapping("/table/paging")
//    public AjaxResponse listTable(@RequestBody String body) {
//        List<DbTable> all = tableService.findAll();
//        AjaxPageableResponse<DbTable> response = new AjaxPageableResponse<>();
//        response.setList(all);
//        return response;
//    }
//
//    @ResponseBody
//    @RequestMapping("/table/save")
//    public AjaxResponse saveTable(@RequestBody DbTable table) {
//        AjaxResponse<Client> response = new AjaxResponse<>();
//        try {
//            tableService.update(table);
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        }
//        return response;
//    }
}
