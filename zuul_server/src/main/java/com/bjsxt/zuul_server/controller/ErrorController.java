package com.bjsxt.zuul_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
    @Override
    public String getErrorPath() {
        return "error";
    }

    @RequestMapping("/error")
    @ResponseBody
    public String errorResult(){
        return "<div align='center'><img src='https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569256988873&di=9383f264d8620b28a50318c5ac3d94d1&imgtype=0&src=http%3A%2F%2Fwww.juimg.com%2Ftuku%2Fyulantu%2F140402%2F330548-1404021G31013.jpg' /></div>";
    }
}
