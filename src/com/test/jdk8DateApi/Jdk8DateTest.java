package com.test.jdk8DateApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class Jdk8DateTest {

    public static void main(String[] args) {
        LocalDateTime now  = LocalDateTime.now();
        System.out.println(now);
        now = now.withNano(0).withSecond(0);
        System.out.println(now);
        System.out.println(now.plusMinutes(1));
        LocalDateTime localDateTime = LocalDateTime.of(2017, 9, 22, 15, 40, 22);
        System.out.println(localDateTime);

        System.out.println(getTimestampOfDateTime(localDateTime));

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("FULL:"+localDateTime.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        System.out.println("LONG:"+localDateTime.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("SHORT:"+localDateTime.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("MEDIUM:"+localDateTime.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG);//DateFormat 选择full会出错
        System.out.println("Full:"+localDateTime.format(dtf));
        dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println("ofPattern:"+localDateTime.format(dtf));

        LocalDate today = LocalDate.now();
        System.out.println(today);

    }


    public static long getTimestampOfDateTime(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return instant.toEpochMilli();
    }

}
