package com.bridge.javaAndPattern;


import com.bridge.javaAndPattern.warrior.HumanWarrior;
import com.bridge.javaAndPattern.warrior.OrcWarrior;
import com.bridge.javaAndPattern.warrior.Warrior;
import com.bridge.javaAndPattern.weapen.Axes;
import com.bridge.javaAndPattern.weapen.Sword;

/**
 * 桥接模式
 * 含有两层结构
 * 抽象类 和 其实现
 * 接口和 其实现
 * 抽象类内聚接口 ，抽象与接口有关的方法
 * 这种特点让我想到了SrtingMvc中的service 调用 dao层的结构 只不过从底层实现理解并非完全的桥接模式，更偏向代理模式
 * 实际上由于必须实现抽象类 失去一定的灵活性
 */
public class Client {

    public static void main(String[] args) {
        Warrior warrior1 = new HumanWarrior("山丘之王");
        warrior1.weapen = new Axes();
        Warrior warrior2 = new OrcWarrior("剑圣");
        warrior2.weapen = new Sword();
        warrior1.attack(warrior2);
        System.out.println("---------------------------");
        warrior2.attack(warrior1);

    }


}
