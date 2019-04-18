package com.command.mashibing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowCurrentCommand implements Command{

    @Override
    public void execute() {
        SimpleDateFormat format =  new SimpleDateFormat("YYYYMMDD HHmmSS");
        System.out.println(format.format(new Date()));
    }
}
