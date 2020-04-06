package com.java.study.collections;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

    //Empty, Comparator, Collection, SortedSet

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("A","B","C","D"));

        System.out.println("All elements: "+ treeSet);

        System.out.println("-------------------------------------\n");
        System.out.println("Ceiling: "+ treeSet.ceiling("C"));   // higher or equals to the argument.
        System.out.println("Higher: "+ treeSet.higher("C"));     // higher to the argument.

        System.out.println("-------------------------------------\n");

        System.out.println("Floor: "+ treeSet.floor("C"));   // lower or equals to the argument.
        System.out.println("Lower: "+ treeSet.lower("C"));    // lower to the argument.

        System.out.println("-------------------------------------\n");
        System.out.println("First: "+ treeSet.first());
        System.out.println("Last: "+ treeSet.last());

        System.out.println("-------------------------------------\n");
        //System.out.println("Pool first: "+ treeSet.pollFirst());
        //System.out.println("Pool last: "+ treeSet.pollLast());

        System.out.println("-------------------------------------\n");
        System.out.println("HeadSet: "+ treeSet.headSet("B"));
        System.out.println("HeadSet inclusive true: "+ treeSet.headSet("B", true));
        System.out.println("HeadSet inclusive false: "+ treeSet.headSet("B", false));

        System.out.println("-------------------------------------\n");
        System.out.println("TailSet: "+ treeSet.tailSet("B"));
        System.out.println("TailSet inclusive true: "+ treeSet.tailSet("B", true));
        System.out.println("TailSet inclusive false: "+ treeSet.tailSet("B", false));

        treeSet.descendingIterator().forEachRemaining(System.out::println);

        System.out.println("-------------------------------------\n");
        NavigableSet<String> strings = treeSet.descendingSet();
        strings.forEach(System.out::println);

    }
}
