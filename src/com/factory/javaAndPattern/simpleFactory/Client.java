package com.factory.javaAndPattern.simpleFactory;

import com.factory.javaAndPattern.Fruit;

/**
 * 静态工厂  静态方法中根据参数来产生不同的对象
 * 不便于扩展
 * 本例参考 Java与模式 一书
 */
public class Client {

    public static void main(String[] args) {
        Fruit fruit =  FruitGardener.factory(FruitType.APPLE);
        fruit.grow();
        fruit =  FruitGardener.factory(FruitType.PEAR);
        fruit.grow();
    }
}
