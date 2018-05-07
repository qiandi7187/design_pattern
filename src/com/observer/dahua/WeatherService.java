package com.observer.dahua;

/**
 * 观察者模式  该例子取自大话设计模式  本人添加多个观察者的实现
 *
 * 关系四个 ：observable 主题  和继承类    observer 被观察者 和 实现类
 *
 */
public class WeatherService {

    public static void main(String[] args) {
        Earth earth = new Earth();
        Satellite satellite =  new Satellite("卫星1");
        Satellite satellite2 =  new Satellite("卫星2");
        earth.addObserver(satellite2);
        earth.addObserver(satellite);
        earth.setWeather("晴");
        earth.setWeather("晴");
        earth.setWeather("多云");
        earth.setWeather("雨");
        earth.setWeather("雨");
    }

}
