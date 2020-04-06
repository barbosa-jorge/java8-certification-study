package com.java.study.functional;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        class Person {
            String gender;
            String name;
            int age;
            Person(String name, int age, String gender) {
                this.gender = gender;
                this.name= name;
                this.age = age;
            }
        }

        Predicate<Person> isOlder = p -> p.age > 18;
        Predicate<Person> isYounger = p -> p.age < 18;
        Predicate<Person> isMale = p -> p.gender.equalsIgnoreCase("MALE");
        Predicate<Person> isFemale = p -> p.gender.equalsIgnoreCase("FEMALE");
        BiPredicate<Person, Integer> isToOld = (p, i) -> p.age > 50;

        IntPredicate isChildPrimitivePredicate = i -> i < 14;

        Person person = new Person("Jorge", 34, "Male");
        Person person2 = new Person("Maria", 15, "Female");
        Person person3 = new Person("Jose", 55, "Male");
        Person person4 = new Person("Lucas", 10, "Male");

        System.out.println("Allow pub entrance: "+ isOlder.test(person));
        System.out.println("is it male and older? " + isMale.and(isOlder).test(person));
        System.out.println("is it female and younger? " + isFemale.and(isYounger).test(person2));
        System.out.println("Is it male or female? " + isMale.or(isFemale).test(person));
        System.out.println("negating " + isMale.and(isOlder).negate().test(person));
        System.out.println("Is it too old? "+ isToOld.test(person3, 50));

        System.out.println("Is it a child? "+ isChildPrimitivePredicate.test(person4.age));


    }
}
