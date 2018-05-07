package com.chainOfResponsibility;


/**
 * 击鼓传花 为责任链模式 非常直观的现实映射
 */
 abstract class Player {
    private Player nextPlayer ;

    private static int count=1;

    public Player() {
        nextPlayer = null;
    }

    public Player(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }


    public abstract void handle();


    //此方法实现递归 直至责任链结束
    public void next(int random){
        handle();
        if(nextPlayer!=null&&count++!=random){
            nextPlayer.next(random);
        }

    }



}
