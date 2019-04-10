package com.command.mashibing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void printTime(){
        SimpleDateFormat format =  new SimpleDateFormat("YYYYMMDD HHmmSS");
        System.out.println(name+":"+format.format(new Date()));
    }

    public void printProjectPath() {
        System.out.println(name+":"+System.getProperty("user.dir"));
    }
}
