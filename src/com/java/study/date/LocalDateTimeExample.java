package com.java.study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime);

        LocalDateTime max = LocalDateTime.MAX;
        System.out.println(max);

        LocalDateTime min = LocalDateTime.MIN;
        System.out.println(min);

        LocalDateTime dateTime2 = LocalDate.now().atTime(LocalTime.of(10, 00, 01));
        System.out.println(dateTime2);

    }
}
