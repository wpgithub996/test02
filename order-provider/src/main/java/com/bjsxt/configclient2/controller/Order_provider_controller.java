package com.bjsxt.configclient2.controller;

import com.bjsxt.order_resource.pojo.TOrder;
import com.bjsxt.configclient2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Order_provider_controller {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/findTOrder")
    @ResponseBody
    public List<TOrder> selectTOrderLimit(@RequestParam(defaultValue = "0")Integer page){
        return orderService.selectTOrder(page);
    }
}
