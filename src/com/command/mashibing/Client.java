package com.command.mashibing;


/**
 * 命令模式可以对不同的recevier进行操作，本例暂不实现
 *
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        invoker.setCommand(new ShowCurrentCommand());
        invoker.execute();
        System.out.println("---------------------------");
        invoker.addBatch( ShowCurrentCommand ::new);
        invoker.addBatch(new ShowProjectPathCommand());
        invoker.executeBatch();
    }

}
