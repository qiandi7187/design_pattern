package com.command.mashibing;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commandBatch = new ArrayList<Command>();

    private Command command ;

    public void setCommand(Command command){
        this.command = command;
    }

    public void addBatch(Command command){
        commandBatch.add(command);
    }

    public void execute(){
        command.execute();
    }

    public void executeBatch(){
        for(Command  command : commandBatch){
            command.execute();
        }
    }


}
