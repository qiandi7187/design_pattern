package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Order;

//处理积分的装潢器
public class OrderPointsDecorator extends OrderDecorator{

    public OrderPointsDecorator(OrderComponent orderComponent) {
        super(orderComponent);
    }


    @Override
    public void beforeDealHanlde(Order order) {

    }

    @Override
    public void afterDealHanlde(Order order) {
        System.out.println("装潢者：points  处理积分");
        if(order.getPayPoints()==null){
            return ;
        }
        //计算抵扣  本例省略校验过程
        int realPayPoints = Math.min(order.getPayPoints()/10,(int)(double)order.getPayMoney());
        order.setPayPoints(realPayPoints);
        order.setPayMoney(order.getPayMoney()-realPayPoints);
        System.out.println(order);
    }
}
