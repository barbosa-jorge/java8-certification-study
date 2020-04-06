package com.java.study.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {

        System.out.println(Duration.ofDays(2));
        System.out.println(Duration.ofHours(2));
        System.out.println(Duration.ofDays(2));
        System.out.println(Duration.ofMillis(1000));
        System.out.println(Duration.ofMinutes(1));
        System.out.println(Duration.ofNanos(15000000000L));
        System.out.println(Duration.of(1, ChronoUnit.DAYS));

        System.out.println(Duration.parse("PT36H"));
        System.out.println(Duration.parse("P2DT48H"));
        System.out.println(Duration.between(LocalTime.of(1,1,1), LocalTime.of(2,2,2)));

        System.out.println(Duration.ZERO);


        System.out.println("--------------------------------------------");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime plusOneDay = dateTime.plus(Duration.parse("P1DT1H10M")).plus(Duration.ofSeconds(20));
        System.out.println(plusOneDay);

        LocalTime date = LocalTime.now();
        System.out.println(date);

        LocalTime plusOneDay2 = date.plus(Duration.parse("P3DT2H"));
        System.out.println(plusOneDay2);

    }
}
