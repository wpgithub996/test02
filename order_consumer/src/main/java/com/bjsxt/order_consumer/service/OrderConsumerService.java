package com.bjsxt.order_consumer.service;

import com.bjsxt.order_resource.pojo.TOrder;

import java.util.List;

public interface OrderConsumerService {
    List<TOrder> selectTOrder(int page);
}
