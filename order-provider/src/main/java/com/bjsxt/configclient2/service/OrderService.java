package com.bjsxt.configclient2.service;

import com.bjsxt.order_resource.pojo.TOrder;

import java.util.List;

public interface OrderService {
    //查询全部订单信息
    List<TOrder> selectTOrder(int page);
}
