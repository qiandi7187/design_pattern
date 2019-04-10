package com.test.jdk8DateApi;

import java.time.LocalDate;
import java.util.Calendar;

public class DateTest {

    public static void main(String[] args) {
        //前一天 0点
        Calendar yestoday = Calendar.getInstance();
        yestoday.add(Calendar.DATE,-1);
        yestoday.set(Calendar.HOUR_OF_DAY,0);
        yestoday.set(Calendar.MINUTE, 0);
        yestoday.set(Calendar.SECOND, 0);
        yestoday.set(Calendar.MILLISECOND, 0);
        System.out.println(yestoday.getTime());
    }
}
