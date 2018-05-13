package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Order;

public abstract class  OrderDecorator  implements OrderComponent{

    private OrderComponent orderComponent;

    public OrderDecorator(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    @Override
    public void deal(Order order){
        orderComponent.deal(order);
    }


}
