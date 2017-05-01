package org.mytms.web.controller;

import com.google.common.collect.Lists;
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

    @ResponseBody
    @RequestMapping("/agent/paging")
    public AjaxPageableResponse listAgent() {
        List<Client> all = clientService.findAll();
        AjaxPageableResponse<Client> response = new AjaxPageableResponse<>();
        response.setList(all);
        return response;
    }

    @ResponseBody
    @RequestMapping("/site/paging")
    public AjaxPageableResponse listSite() {
        List<Site> all = Lists.newArrayList();
        Site site = new Site(1, "web01", "192.168.0.1", "网易", "www.163.com", 200);
        site.steps = Lists.newArrayList();
        site.steps.add(new Step(1, "step01", "www.163.com/music", "", 3000, "结果01", 200));
        site.steps.add(new Step(2, "step02", "www.163.com/games", "", 3000, "结果02", 200));
        all.add(site);
        site = new Site(2, "web02", "192.168.0.2", "搜狐", "www.sohu.com", 200);
        site.steps = Lists.newArrayList();
        site.steps.add(new Step(3, "step01", "www.sohu.com/music", "", 4000, "结果01", 200));
        site.steps.add(new Step(4, "step02", "www.sohu.com/games", "", 5000, "结果02", 200));
        all.add(site);
        AjaxPageableResponse<Site> response = new AjaxPageableResponse<>();
        response.setList(all);
        return response;
    }

    class Site {
        public long id;
        public String host;
        public String ip;
        public String web;
        public String url;
        public int status;
        public List<Step> steps;

        public Site() {
        }

        public Site(long id, String host, String ip, String web, String url, int status) {
            this.id = id;
            this.host = host;
            this.ip = ip;
            this.web = web;
            this.url = url;
            this.status = status;
        }
    }

    class Step {
        public Step() {
        }

        public Step(long id, String name, String url, String post, int timeout, String result, int code) {
            this.id = id;
            this.name = name;
            this.url = url;
            this.post = post;
            this.timeout = timeout;
            this.result = result;
            this.code = code;
        }

        public long id;
        public String name;
        public String url;
        public String post;
        public int timeout;
        public String result;
        public int code;
    }
}
