package com.bjsxt.configclient2.service.impl;

import com.bjsxt.order_resource.pojo.TOrder;
import com.bjsxt.order_resource.pojo.TOrderExample;
import com.bjsxt.configclient2.mapper.TOrderMapper;
import com.bjsxt.configclient2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private TOrderMapper tOrderMapper;
    @Override
    public List<TOrder> selectTOrder(int page) {
       return tOrderMapper.selectByLimit(page,2);
    }
}
