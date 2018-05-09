package com.state.mashibing;

public class CommonState extends State{

    public CommonState() {
        super("正常模式");
    }

    public void move(){
        System.out.println("汽车在正常模式下行驶。。。");
    }

}
