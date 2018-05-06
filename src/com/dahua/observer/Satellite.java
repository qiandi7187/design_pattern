package com.dahua.observer;

import java.util.Observable;
import java.util.Observer;

public class Satellite implements Observer {
    //添加卫星名字来区分多个观察者
    private String name;

    public Satellite(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+" 天气变化："+(String)arg);
    }
}
