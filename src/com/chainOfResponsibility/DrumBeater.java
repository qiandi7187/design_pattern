package com.chainOfResponsibility;

import java.util.Random;

public class DrumBeater {

    public static void main(String[] args) {
        Player player = new JiaMu(new JiaZheng(new JiaBaoYu(new JiaShe())));

        System.out.println("-----自动next-----");
        int count = new Random().nextInt(4);
        System.out.println(count);
        player.next(count);

    }
}
