package com.bjsxt.order_consumer.service.impl;

import com.bjsxt.order_consumer.service.OrderConsumerService;
import com.bjsxt.order_resource.pojo.TOrder;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class OrderConsumerServiceImpl implements OrderConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<TOrder> selectTOrder(int page) {
        TOrder[] tOrders = restTemplate.postForObject("http://localhost:9999/op/findTOrder?token=88888", page, TOrder[].class);
        return Arrays.asList(tOrders);
    }

}
