package com.java.study.date;

import java.time.*;

public class PeriodExample {

    public static void main(String[] args) {

        System.out.println(Period.ofYears(2));
        System.out.println(Period.ofMonths(2));
        System.out.println(Period.ofDays(2));
        System.out.println(Period.ofWeeks(4));
        System.out.println(Period.of(1,2,4));
        System.out.println(Period.between(LocalDate.of(2020, 01, 1), LocalDate.now()));

        System.out.println(Period.parse("p100y30m50d"));


        Period period = Period.ofYears(1);

        LocalDate now = LocalDate.now();
        LocalDate nowPlusYear = now.plus(period);
        System.out.println(nowPlusYear);

        LocalDate nowAgain = nowPlusYear.minus(period);
        System.out.println(nowAgain);

    }
}
