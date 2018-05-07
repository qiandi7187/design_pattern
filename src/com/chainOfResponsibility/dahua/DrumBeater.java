package com.chainOfResponsibility.dahua;

import java.util.Random;

/**
 * 本例采用递归形式
 * 还有一种形式 采用list存储chain
 */
public class DrumBeater {

    public static void main(String[] args) {
        Player player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaShe())));

        System.out.println("-----自动next-----");
        int count = new Random().nextInt(4);
        System.out.println(count);
        player.next(count);

    }
}
