package com.command.mashibing;


/**
 * 命令模式本质是将方法升级为对象操作  以便对多个功能进行一系列处理和封装
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
