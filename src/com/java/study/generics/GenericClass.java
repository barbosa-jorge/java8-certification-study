package com.java.study.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat eating");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog eating");
    }
}

class Cow {
    public void eat() {
        System.out.println("cow eating");
    }
}

public class GenericClass<K extends Long, S> {

    private K id;
    private S name;

    public GenericClass(K id, S name) {
        this.id = id;
        this.name = name;
    }

    public GenericClass() {
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public static void main(String[] args) {
//
//        GenericClass<Long, String> genericClass = new GenericClass<>(1L, "Jorge");
//        System.out.println("id: "+ genericClass.getId());
//        System.out.println("name: "+ genericClass.getName());
//
        Animal cat = new Cat();
        Animal dog = new Dog();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        feedAnimals(animals);

    }

    public static <T extends Animal> void feedAnimals(T t) {
        System.out.println("eating");
    }

    public static void feedAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

}
