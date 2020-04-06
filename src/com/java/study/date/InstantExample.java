package com.java.study.date;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class InstantExample {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        instant = instant.plus(Period.ofDays(300)).plus(Period.ofWeeks(200))
                .plus(Duration.ofSeconds(200)).plus(Duration.ofMinutes(200))
                .plus(Duration.ofHours(200)).plus(Duration.ofDays(200));
        System.out.println(instant);

        System.out.println(instant.minus(Period.ofDays(2)).minus(Period.ofWeeks(20)));

    }
}
