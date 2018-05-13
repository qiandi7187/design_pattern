package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Order;

public class OrderBasicComponent implements OrderComponent {

    @Override
    public void deal(Order order) {
        System.out.println("Baisc:计算订单消费情况");
        order.getOrderDetails().forEach(orderDetail ->order.setPayMoney(order.getPayMoney()+orderDetail.getPrice()*orderDetail.getNumber()));
        order.setSumMoney(order.getPayMoney());
        System.out.println(order);
    }
}
