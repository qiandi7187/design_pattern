package com.decorator.javaAndPattern.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

public class Order {

    private Integer uid;

    private Double sumMoney = 0.0;

    private Double payMoney = 0.0;

    private Integer payPoints;

    private Bonus bonus;

    private List<OrderDetail> orderDetails;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uid=" + uid +
                ", sumMoney=" + sumMoney +
                ", payMoney=" + payMoney +
                ", payPoints=" + payPoints +
                ", bonus=" + bonus +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
