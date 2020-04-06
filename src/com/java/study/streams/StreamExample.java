package com.java.study.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

enum GENDER {
    MALE, FEMALE
}

class Hobby {

    String name;

    public Hobby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Person {

    String name;
    int age;
    GENDER gender;
    List<Hobby> hobbies;

    public Person(String name, int age, GENDER gender, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                '}';
    }
}

public class StreamExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jorge", 34, GENDER.MALE,
                        new ArrayList<>(Arrays.asList(new Hobby("Soccer"), new Hobby("Studying")))),
                new Person("Maria", 31, GENDER.FEMALE,
                        new ArrayList<>(Arrays.asList(new Hobby("Reading"), new Hobby("Writing")))),
                new Person("João", 45, GENDER.MALE,
                        new ArrayList<>(Arrays.asList(new Hobby("Soccer"), new Hobby("Play Guitar")))));

        System.out.println("Count: " + people.stream().count());

        people.stream().max(Comparator.comparing(Person::getAge))
                .ifPresent(p -> System.out.println("Person with max age is: "+ p.name));

        people.stream().min(Comparator.comparing(Person::getAge))
                .ifPresent(p -> System.out.println("Person with min age is: "+ p.name));

        people.stream().mapToInt(Person::getAge).reduce((i1, i2) -> i1 + i2)
                .ifPresent(i -> System.out.println("Sum of ages: " + i));

        Arrays.asList("a","b","c","d").stream().reduce((s1,s2) -> s1+s2).ifPresent(System.out::println);

        people.stream().sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.println(p.name));

        System.out.println("------------------- using compareTo to sort ------------------------------");
        people.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p.name));

        System.out.println("--");

        people.stream().sorted((p1,p2) -> p2.getName().compareTo(p1.getName()))
                .forEach(p -> System.out.println(p.name));

        System.out.println("-------------------------------------------------");

        people.stream().sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(p -> System.out.println(p.name));

        people.stream().findFirst().ifPresent(System.out::println);
        people.stream().findAny().ifPresent(System.out::println);

        people.stream().filter(p -> p.age > 35).forEach(System.out::println);

    }
}
