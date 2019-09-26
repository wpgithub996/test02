package com.bjsxt.order_consumer.controller;

import com.bjsxt.order_consumer.service.OrderConsumerService;
import com.bjsxt.order_resource.pojo.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderConsumerController {
    @Autowired
    private OrderConsumerService service;

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/findOrder")
    @ResponseBody
    public List<TOrder> selectOrder(@RequestParam(defaultValue = "0")Integer page){
        return service.selectTOrder(page);
    }
}
