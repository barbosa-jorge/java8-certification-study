package com.java.study.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<com.java.study.streams.Person> people = Arrays.asList(
                new com.java.study.streams.Person("Jorge", 34, com.java.study.streams.GENDER.MALE,
                        new ArrayList<>(Arrays.asList(new com.java.study.streams.Hobby("Soccer"), new com.java.study.streams.Hobby("Studying")))),
                new com.java.study.streams.Person("Maria", 31, com.java.study.streams.GENDER.FEMALE,
                        new ArrayList<>(Arrays.asList(new com.java.study.streams.Hobby("Reading"), new com.java.study.streams.Hobby("Writing")))),
                new com.java.study.streams.Person("João", 45, com.java.study.streams.GENDER.MALE,
                        new ArrayList<>(Arrays.asList(new com.java.study.streams.Hobby("Soccer"), new com.java.study.streams.Hobby("Play Guitar")))));

        System.out.println("-------------------collect to set-----------------------");
        Set<Person> set = people.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("--------------------collect to map-----------------------");

        Map<Integer, Person> map = people.stream().collect(Collectors.toMap(p -> p.getAge(), p -> p));
        map.forEach((k,v) -> System.out.println("Key: "+ k +"Value: "+ v));

        Map<Integer, Person> map2 = people.stream().collect(Collectors.toMap(Person::getAge, Function.identity()));
        map2.forEach((k,v) -> System.out.println("Key: "+ k +" Value: "+ v));

        System.out.println("--------------------grouping-----------------------");

        Map<GENDER, List<Person>> mapByAge = people.stream().collect(Collectors.groupingBy(Person::getGender));
        mapByAge.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("---");
        Map<GENDER, Set<Person>> mapByAgeAsSet = people.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.toSet()));
        mapByAgeAsSet.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("---");

        Map<GENDER, Double> mapByAgeAverageAge = people.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.averagingInt(Person::getAge)));
        mapByAgeAverageAge.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("---");

        Map<GENDER, Integer> mapByAgeSummingAge = people.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.summingInt(Person::getAge)));
        mapByAgeSummingAge.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("--- grouping by two fields ---");

        Map<GENDER, Map<Integer, List<Person>>> mapByGenderAndAge = people.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.groupingBy(Person::getAge)));
        mapByGenderAndAge.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));

        System.out.println("----------------max by-------------");

        Map<GENDER, Optional<Person>> mapByGenderMaxAge = people.stream().collect(Collectors.groupingBy(Person::getGender,
                Collectors.maxBy(Comparator.comparingInt(Person::getAge))));
        mapByGenderMaxAge.forEach((k,v) -> System.out.println("Key: "+ k + " Value: "+ v));


        System.out.println("----------------summarizing-------------");

        Map<GENDER, IntSummaryStatistics> mapSummarized = people.stream().collect(Collectors.groupingBy(Person::getGender,
                Collectors.summarizingInt(Person::getAge)));
        mapSummarized.forEach((k,v) -> System.out.println(
                 "Key: " + k +
                " Average age: " + v.getAverage() +
                " Count: " + v.getCount() +
                " Min: " + v.getMin() +
                " Max: " + v.getMax() +
                " Sum: " + v.getSum()));

    }
}
