package com.java.study.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque array = new ArrayDeque(20);

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.addFirst("E");
        array.addLast("F");

        System.out.println("---------------------------\n");
        array.forEach(System.out::println);

        System.out.println("---------------------------\n");
        System.out.println("First: " + array.getFirst());
        System.out.println("Last: " + array.getLast());

        System.out.println("---------------------------\n");
        System.out.println("peek: " + array.peek());
        System.out.println("peek first: " + array.peekFirst());
        System.out.println("peek last: " + array.peekLast());

        System.out.println("---------------------------\n");
        array.forEach(System.out::println);

//        return null if empty

        System.out.println("---------------------------\n");
        array.clear();
        System.out.println("poll: " + array.poll());  // remove object, return null if array is empty
        System.out.println("poll first: " + array.pollFirst());
        System.out.println("poll last: " + array.pollLast());

        System.out.println("---------------------------\n");
        array.forEach(System.out::println);


        System.out.println("---------------------------\n");
       // array.clear();
        System.out.println("offer: " + array.offer("A")); // add object to array
        System.out.println("offer first: " + array.offerFirst("B"));
        System.out.println("offer last: " + array.offerLast("C"));

        System.out.println("---------------------------\n");
        array.forEach(System.out::println);

        array.clear();
        array.pop();  // remove from beginning or throws NoSuchElementException if array is empty;
        array.push("X"); // add beginning of array.

        System.out.println("---------------------------\n");
        array.forEach(System.out::println);
    }
}
