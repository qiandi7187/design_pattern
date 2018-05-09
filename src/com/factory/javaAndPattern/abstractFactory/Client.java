package com.factory.javaAndPattern.abstractFactory;

/**
 * 抽象工厂 用于产品族  继承工厂接口
 * 本例借鉴 Java与模式 一书
 *  果汁工厂  果奶工厂 实现 接口水果工厂 中 苹果饮料 和 梨子饮料 的方法
 *  产品继承： 饮料  -》 果汁 -》 苹果汁
 *                           -》 梨子汁
 *                  -》 果奶 -》 苹果奶
 *                           -》 梨子奶
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


        System.out.println("#################想调用子类专有方法还需要强转#################");
        PearJuice pearJuice =  (PearJuice)new JuiceFactory().pearDrinkCreator();
        pearJuice.juice();
        pearJuice.drink();
        System.out.println("-------------------");
        AppleMilk appleMilk =  (AppleMilk)new FruitMilkFactory().appleDrinkCreator();
        appleMilk.mix();
        appleMilk.drink();


    }
}
