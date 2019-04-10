package com.chainOfResponsibility.dahua;

import java.util.Random;

/**
 * 本例采用递归形式  handle 方法中包含对责任链逻辑的处理 和 下一个 对象的传递
 * 还有一种形式 采用list存储chain
 *
 * 责任链模式 包含 抽象类 和实现
 */
public class DrumBeater {

    public static void main(String[] args) {
        //Player player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaShe(null))));
        Player player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaShe(null))));
        System.out.println("-----自动next-----");
        int count = new Random().nextInt(4);
        System.out.println(count);
        player.execute(count);

    }
}
