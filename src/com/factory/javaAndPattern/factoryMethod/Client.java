package com.factory.javaAndPattern.factoryMethod;

import com.factory.javaAndPattern.Fruit;

/**
 * 工厂方法 实现工厂接口 来获取对象 便于扩展
 * 本例参考 Java与模式 一书
 */
public class Client {

    public static void main(String[] args) {
        Fruit fruit = new AppleGardener().factory();
        fruit.grow();
        fruit =  new PearGardener().factory();
        fruit.grow();
    }
}
