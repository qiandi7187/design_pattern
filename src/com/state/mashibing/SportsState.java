package com.state.mashibing;

public class SportsState extends State{

    public SportsState() {
        super("运动模式");
    }

    public void move(){

        System.out.println("汽车在运动模式下行驶。。。");
    }

}
