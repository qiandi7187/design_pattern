package com.bridge.javaAndPattern.weapen;


import com.bridge.javaAndPattern.warrior.Warrior;

public class Sword implements Weapen{

    @Override
    public void isUsedToAttack(Warrior enemy){
        System.out.println("用剑刺向 "+enemy.name);
    }
}
