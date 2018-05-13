package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Order;

//处理红包的装潢器
public class OrderBonusDecorator extends OrderDecorator{

    public OrderBonusDecorator(OrderComponent orderComponent) {
        super(orderComponent);
    }


    @Override
    public void beforeDealHanlde(Order order) {

    }

    @Override
    public void afterDealHanlde(Order order) {
        System.out.println("装潢者：bonus 处理红包");
        if(order.getBonus()==null){
            return ;
        }
        //计算抵扣  本例省略校验过程
        order.setPayMoney(Math.max(order.getPayMoney()-order.getBonus().getDiscount(),0));
        System.out.println(order);
    }
}
