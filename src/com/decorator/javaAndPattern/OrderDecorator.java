package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Order;

public abstract class  OrderDecorator  implements OrderComponent{

    private OrderComponent orderComponent;

    public OrderDecorator(OrderComponent orderComponent) {
        this.orderComponent = orderComponent;
    }

    @Override
    public final void  deal(Order order){
        beforeDealHanlde(order);
        orderComponent.deal(order);
        afterDealHanlde(order);
    }

    //子类实现一下两种即可
    public abstract void beforeDealHanlde(Order order);

    public abstract void afterDealHanlde(Order order);


}
