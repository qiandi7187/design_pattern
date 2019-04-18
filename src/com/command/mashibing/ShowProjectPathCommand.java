package com.command.mashibing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowProjectPathCommand implements Command{

    @Override
    public void execute() {
        System.out.println(System.getProperty("user.dir"));
    }
}
