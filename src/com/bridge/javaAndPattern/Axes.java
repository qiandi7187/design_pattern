package com.bridge.javaAndPattern;

/**
 * 攻击本来就是武器的必要属性
 */
public class Axes implements Weapen{

    @Override
    public void isUsedToAttack(Warrior enemy){
        System.out.println("用斧劈向 "+enemy.name);
    }
}
