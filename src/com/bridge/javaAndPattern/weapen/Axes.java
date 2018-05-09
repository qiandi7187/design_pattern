package com.bridge.javaAndPattern.weapen;


import com.bridge.javaAndPattern.warrior.Warrior;

/**
 * 攻击本来就是武器的必要属性
 */
public class Axes implements Weapen{

    @Override
    public void isUsedToAttack(Warrior enemy){
        System.out.println("用斧劈向 "+enemy.name);
    }
}
