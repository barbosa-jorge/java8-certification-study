package com.java.study.collections;

import java.util.ArrayList;

public class ArrayListtExample {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.ensureCapacity(20);
        array.add("A");
        array.add(1,"B");
        array.set(1,"C");
        array.removeIf(s-> s.equals("A"));
        System.out.println("size before trim: "+ array.size());
        array.trimToSize();
        System.out.println("size after trim: "+array.size());
        array.forEach(System.out::println);

    }
}
