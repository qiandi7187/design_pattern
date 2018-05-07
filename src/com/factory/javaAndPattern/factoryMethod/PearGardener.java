package com.factory.javaAndPattern.factoryMethod;

import com.factory.javaAndPattern.Fruit;
import com.factory.javaAndPattern.Pear;

public class PearGardener implements Gardener{

    @Override
    public Fruit factory() {
        return new Pear();
    }
}
