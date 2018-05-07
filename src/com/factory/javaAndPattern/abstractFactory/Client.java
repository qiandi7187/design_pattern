package com.factory.javaAndPattern.abstractFactory;

/**
 * 抽象工厂 用于产品族  继承工厂接口
 * 本例借鉴 Java与模式 一书
 *  果汁工厂  果奶工厂
 *
 *  其中
 */
public class Client {

    public static void main(String[] args) {

        DrinkFactory factory = new JuiceFactory();
        Drink drink =  factory.appleDrinkCreator();
        drink.drink();
        drink =  factory.pearDrinkCreator();
        drink.drink();
        System.out.println("-------------------");
        factory = new FruitMilkFactory();
        drink =  factory.appleDrinkCreator();
        drink.drink();
        drink =  factory.pearDrinkCreator();
        drink.drink();


        System.out.println("--------想调用子类专有方法还需要强转-----------");
        PearJuice pearJuice =  (PearJuice)new JuiceFactory().pearDrinkCreator();
        pearJuice.juice();
        pearJuice.drink();
        AppleMilk appleMilk =  (AppleMilk)new FruitMilkFactory().appleDrinkCreator();
        appleMilk.mix();
        appleMilk.drink();


    }
}
