package com.state.mashibing;

/**
 * 状态模式使用情况并不多见
 * 结构类似策略模式 但是 策略模式一般运行过程不必，状态模式随时切换
 * 结构 context类 + State接口和实现
 */
public class Client {

    public static void main(String[] args) {
        CarRunningContext context = new CarRunningContext();
        context.setState(new CommonState());
        context.show();
        context.move();
        System.out.println("-------------------------------");
        context.setState(new SportsState());
        context.show();
        context.move();
    }
}
