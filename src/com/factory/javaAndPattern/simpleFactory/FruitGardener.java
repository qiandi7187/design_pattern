package com.factory.javaAndPattern.simpleFactory;

import com.factory.javaAndPattern.Apple;
import com.factory.javaAndPattern.Fruit;
import com.factory.javaAndPattern.Pear;

public class FruitGardener {

    private FruitGardener(){}

    public static Fruit factory(FruitType fruitType){
        if(fruitType.equals(FruitType.APPLE)){
            return new Apple();
        }else if(fruitType.equals(FruitType.PEAR)){
            return new Pear();
        }
         return null;
    }

}
