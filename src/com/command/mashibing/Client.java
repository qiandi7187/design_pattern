package com.command.mashibing;


/**
 * 命令模式本质是将方法升级为对象操作  以便对多个功能进行一系列处理和封装
 *
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        invoker.setCommand(new ShowCurrentCommand(new Receiver("接收者1")));
        invoker.execute();
        System.out.println("---------------------------");
        Receiver receiver = new Receiver("接收者2");
        invoker.addBatch(new ShowCurrentCommand(receiver));
        invoker.addBatch(new ShowProjectPathCommand(receiver));
        invoker.executeBatch();
    }

}
