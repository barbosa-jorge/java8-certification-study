package com.java.study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2019, 1, 20);
        System.out.println(date1);

        LocalDate localDate = date1.minusDays(5).plusDays(1).plusMonths(1).plusWeeks(4).plusYears(1);
        System.out.println(localDate);

        date1 = date1.plus(1,ChronoUnit.DAYS)
                .plus(1, ChronoUnit.MONTHS)
                .plus(2,ChronoUnit.YEARS);

        System.out.println(date1);

        LocalDate date2 = LocalDate.now();

        System.out.println("month: " + date2.getMonth());
        System.out.println("year: " + date2.getYear());
        System.out.println("day of month: " + date2.getDayOfMonth());
        System.out.println("day of week: " + date2.getDayOfWeek());
        System.out.println("day of year: " + date2.getDayOfYear());
        System.out.println("month value: " + date2.getMonthValue());
        System.out.println("era: " + date2.getEra());
        System.out.println("chronology: " + date2.getChronology());

        System.out.println("-----------------------------------------------");

        LocalDate now = LocalDate.now();
        LocalDate now2 = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        System.out.println("now  is before tomorrow? " + now.isBefore(tomorrow));
        System.out.println("now  is after tomorrow? " + now.isAfter(tomorrow));
        System.out.println("now  is equal tomorrow? " + now.isEqual(tomorrow));
        System.out.println("now  is equal now2? " + now.isEqual(now2));

        System.out.println("--------------------formatting date and time-----------------------------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y/M/d");

        LocalDate date3 = LocalDate.parse("2018/02/28", formatter);
        System.out.println(formatter.format(date3));

        LocalDate date4 = LocalDate.parse("2018-02-28");
        System.out.println(formatter.format(date4));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d-MMM-y", Locale.US);

        LocalDate date5 = LocalDate.parse("16-Jan-2019", formatter2);
        System.out.println(formatter2.format(date5));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("E, MMMM d y", Locale.US);
        LocalDate date6 = LocalDate.parse("Tue, March 31 2020", formatter3);
        System.out.println(formatter3.format(date6));

        DateTimeFormatter formatter4 = DateTimeFormatter
                .ofPattern("E, 'on' 'day' dd 'month' MM 'and year' yyyy ", Locale.US);
        LocalDate date7 = LocalDate.parse("Tue, on day 31 month 03 and year 2020 ", formatter4);
        System.out.println(formatter4.format(date7));


        DateTimeFormatter formatter5 = DateTimeFormatter
                .ofPattern("dd 'of' MMMM 'of' yyyy ", Locale.US);
        LocalDate date8 = LocalDate.parse("31 of March of 2020 ", formatter5);
        System.out.println(formatter5.format(date8));

        DateTimeFormatter formatter6 = DateTimeFormatter
                .ofPattern("dd 'de' MMMM 'de' yyyy ", new Locale("pt","BR"));
        LocalDate date9 = LocalDate.parse("31 de Março de 2020 ", formatter6);
        System.out.println(formatter6.format(date9));

    }

}
