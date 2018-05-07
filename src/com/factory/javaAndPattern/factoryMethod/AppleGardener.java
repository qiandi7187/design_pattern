package com.factory.javaAndPattern.factoryMethod;

import com.factory.javaAndPattern.Apple;
import com.factory.javaAndPattern.Fruit;

public class AppleGardener implements Gardener{

    @Override
    public Fruit factory() {
        return new Apple();
    }
}
