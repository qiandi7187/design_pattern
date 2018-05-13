package com.decorator.javaAndPattern;

import com.decorator.javaAndPattern.pojo.Bonus;
import com.decorator.javaAndPattern.pojo.Order;
import com.decorator.javaAndPattern.pojo.OrderDetail;

import java.util.ArrayList;
import java.util.List;


/**
 *  原项目中的订单流程过于复杂  涉及红包 积分 等等
 *  装潢模式最适合此等场景
 *
 *  结构类似责任链 但是有所区别 本例当然也可以用责任链来实现
 *  责任链有中断  装潢执行到底
 *  责任链没有被装潢者和装潢者的区别
 *
 *  本例添加在原例的基础上 进一步封装  装饰着抽象类的方法  子类只需要实现before 和 after的业务逻辑
 */
public class Client {

    public static void main(String[] args) {

        List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        orderDetails.add(new OrderDetail(1,1,2,2.0));
        orderDetails.add(new OrderDetail(1,3,5,1.0));
        Bonus bonus = new Bonus(1,1,5);
        Order order =  new  Order();
        order.setOrderDetails(orderDetails);
        order.setBonus(bonus);
        order.setPayPoints(10);
        System.out.println("处理前："+order);
        OrderDecorator orderDecorator = new OrderPointsDecorator(new OrderBonusDecorator(new OrderBasicComponent()));
        orderDecorator.deal(order);
    }
}
