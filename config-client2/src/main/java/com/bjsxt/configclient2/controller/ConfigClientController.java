package com.bjsxt.configclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class ConfigClientController {

    @Value("${app.name}")
    private String name;
    @RequestMapping("/")
    @ResponseBody
    public String test(){
        return name;
    }

}
