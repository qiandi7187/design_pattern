package com.command.mashibing;


/**
 * 命令模式可以对不同的recevier进行操作，本例暂不实现
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
