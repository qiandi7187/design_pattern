package com.command.mashibing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowProjectPathCommand implements Command{
    private Receiver receiver;

    public ShowProjectPathCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.printProjectPath();
    }
}
