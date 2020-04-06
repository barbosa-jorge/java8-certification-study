package com.java.study.date;

import java.time.*;

public class TimeZoneExample {
    public static void main(String[] args) {

        System.out.println("------------------Zone ID---------------------");
        //Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //availableZoneIds.forEach(System.out::println);

        ZoneId z = ZoneId.of("UTC-07:00");
        ZoneId z2 = ZoneId.of("GMT-07:00");
        ZoneId z3 = ZoneId.of("UT-07:00");
        ZoneId z4 = ZoneId.of("-07:00");
        ZoneId z5 = ZoneId.of("America/Vancouver");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(z);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(z2);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(z3);
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(z4);
        ZonedDateTime zonedDateTime4 = ZonedDateTime.now(z5);

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);

        System.out.println("-------------------zone off set------------------");

        ZoneOffset zoneOffset0 = ZoneOffset.of("Z");
        ZoneOffset zoneOffset = ZoneOffset.of("-7");
        ZoneOffset zoneOffset2 = ZoneOffset.of("-07:00");
        ZoneOffset zoneOffset3 = ZoneOffset.ofHours(-7);

        LocalTime localTime = LocalTime.now();
        OffsetTime offsetTime = OffsetTime.of(localTime, zoneOffset);
        OffsetTime offsetTime2 = OffsetTime.of(localTime, zoneOffset2);
        OffsetTime offsetTime3 = OffsetTime.of(localTime, zoneOffset3);
        OffsetTime offsetTime4 = OffsetTime.of(localTime, zoneOffset0);
        System.out.println(offsetTime);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTime4);

        System.out.println("-------------------------------------------------");

        LocalTime localTime1 = LocalTime.of(10, 20);
        ZoneOffset zoneOffset1 = ZoneOffset.of("+06:00");
        OffsetTime offsetTime1 = OffsetTime.of(localTime1, zoneOffset1);
        System.out.println(offsetTime1);

        ZoneOffset zoneOffset4 = ZoneOffset.of("+07:00");
        OffsetTime offsetTime5 = offsetTime1.withOffsetSameInstant(zoneOffset4);
        System.out.println(offsetTime5);

        System.out.println("------------------------OffSetDateTime---------------------------------");

        LocalDateTime localDateTime = LocalDateTime.of(2020,10,10, 15,00,00);

        LocalDate localDate = LocalDate.of(2020, 10,10);
        LocalTime localTime10 = LocalTime.of(10,00,00);

        ZoneOffset zoneOffset10 = ZoneOffset.of("+03:00");
        ZoneOffset zoneOffset11 = ZoneOffset.of("+01:00");

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset10);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(localDate, localTime10, zoneOffset11);

        offsetDateTime = offsetDateTime.minusHours(4);

        System.out.println(offsetDateTime); // 11h -3 = 8
        System.out.println(offsetDateTime2); // 10h -1 = 9

        System.out.println(offsetDateTime.isBefore(offsetDateTime2));


        System.out.println("-----------------------zoned date time------------------------------------");

        LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,10,10,10);
        ZoneId zoneId = ZoneId.of("America/Vancouver");
        ZonedDateTime zonedDateTime5 = ZonedDateTime.of(localDateTime1, zoneId);

        ZonedDateTime zonedDateTime6 = zonedDateTime5.withMonth(3).withDayOfMonth(1).withYear(2010);
        System.out.println(zonedDateTime6.getOffset());

        System.out.println("-----------------------------daylight savings---------------------------------------");

        ZoneId paris = ZoneId.of("Europe/Paris");
        LocalDateTime lForwardDST = LocalDateTime.of(2018, 3, 25,2, 30);
        LocalDateTime lBackwardDST = LocalDateTime.of(2018, 10, 28, 2, 30);

        ZonedDateTime zForwardDST = ZonedDateTime.of(lForwardDST, paris);
        System.out.println("zForwardDST: " + zForwardDST);  // 3:30

        ZonedDateTime zBackwardDST = ZonedDateTime.of(lBackwardDST, paris);
        System.out.println("zBackwardDST: "+zBackwardDST);  // 2:30

        System.out.println("withEarlierOffsetAtOverlap: "+zBackwardDST.withEarlierOffsetAtOverlap());
        System.out.println("withLaterOffsetAtOverlap: "+zBackwardDST.withLaterOffsetAtOverlap());


        System.out.println("-----------------italy example-------");

        // daylight starts at 3am
        ZonedDateTime zdt4 = ZonedDateTime.of(
                2015, 3, 29, 2, 30, 0, 0, ZoneId.of("Europe/Rome"));
        System.out.println(zdt4);

        // day light ends at 3AM
        ZonedDateTime zdt = ZonedDateTime.of(
                2015, 10, 25, 2, 30, 0, 0, ZoneId.of("Europe/Rome"));
        ZonedDateTime zdt2 = zdt.plusHours(1);
        System.out.println(zdt);
        System.out.println(zdt2);

    }
}
