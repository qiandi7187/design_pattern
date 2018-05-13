package com.decorator.javaAndPattern.pojo;


public class OrderDetail {

    private Integer uid;

    private Integer pid;

    private Integer number;

    private Double price;

    public OrderDetail(Integer uid, Integer pid, Integer number, Double price) {
        this.uid = uid;
        this.pid = pid;
        this.number = number;
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "uid=" + uid +
                ", pid=" + pid +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
