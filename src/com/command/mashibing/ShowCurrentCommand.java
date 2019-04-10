package com.command.mashibing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowCurrentCommand implements Command{

    private Receiver receiver;

    public ShowCurrentCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.printTime();
    }



}
