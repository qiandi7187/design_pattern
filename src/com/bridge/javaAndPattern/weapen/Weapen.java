package com.bridge.javaAndPattern.weapen;


import com.bridge.javaAndPattern.warrior.Warrior;

/**
 * 攻击本来就是武器的必要属性
 */
public interface Weapen {

    void isUsedToAttack(Warrior enemy);
}
