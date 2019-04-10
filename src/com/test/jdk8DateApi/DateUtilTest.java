package com.test.jdk8DateApi;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class DateUtilTest {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(DateUtils.addMinutes(now,1));
        System.out.println(DateUtils.ceiling(now, Calendar.MINUTE));
        System.out.println(DateUtils.ceiling(now, Calendar.HOUR));
    }
}
