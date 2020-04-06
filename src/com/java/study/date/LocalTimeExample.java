package com.java.study.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalTimeExample {

    public static void main(String[] args) {
        System.out.println(LocalTime.of(10, 30, 01));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.ofNanoOfDay(15000000000000L));
        System.out.println(LocalTime.ofSecondOfDay(40000L));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US);
        System.out.println(LocalTime.parse("16:10:02", formatter));
        System.out.println(LocalTime.now().format(formatter));


        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("'hour:' HH 'minute:' mm 'second:' ss", Locale.US);
        System.out.println(LocalTime.parse("16:10:02"));
        System.out.println(LocalTime.now().format(formatter2));



    }

}
