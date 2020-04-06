package com.java.study.collections;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapExample {

    //Empty, Comparator, Collection, SortedSet

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A",1);
        treeMap.put("B",2);
        treeMap.put("C",3);
        treeMap.put("D",4);

        System.out.println("All elements: "+ treeMap);

        System.out.println("-------------------------------------\n");
        System.out.println("Ceiling key: "+ treeMap.ceilingKey("C"));   // higher or equals to the argument.
        System.out.println("Ceiling entry: "+ treeMap.ceilingEntry("C"));   // higher or equals to the argument.

        System.out.println("Higher key: "+ treeMap.higherKey("C"));     // higher to the argument.
        System.out.println("Higher entry: "+ treeMap.higherEntry("C"));     // higher to the argument.

        System.out.println("-------------------------------------\n");

        Map.Entry<String, Integer> c = treeMap.ceilingEntry("C");
        System.out.println(c.getValue());
        System.out.println(c.getKey());

        System.out.println("-------------------------------------\n");

        System.out.println("Floor key: "+ treeMap.floorKey("C"));   // lower or equals to the argument.
        System.out.println("Lower key: "+ treeMap.lowerKey("C"));    // lower to the argument.

        System.out.println("Floor entry: "+ treeMap.floorEntry("C"));   // lower or equals to the argument.
        System.out.println("Lower entry: "+ treeMap.lowerEntry("C"));    // lower to the argument.


        System.out.println("-------------------------------------\n");
        System.out.println("First key: "+ treeMap.firstKey());
        System.out.println("Last key: "+ treeMap.lastKey());

        System.out.println("First entry: "+ treeMap.firstEntry());
        System.out.println("Last entry: "+ treeMap.lastEntry());

        System.out.println("-------------------------------------\n");

//        System.out.println("Pool first: "+ treeMap.pollFirstEntry());
//        System.out.println("Pool last: "+ treeMap.pollLastEntry());

        System.out.println("-------------------------------------\n");
        System.out.println("HeadMap: "+ treeMap.headMap("B"));
        System.out.println("HeadMap inclusive true: "+ treeMap.headMap("B", true));
        System.out.println("HeadMap inclusive false: "+ treeMap.headMap("B", false));

        System.out.println("-------------------------------------\n");
        System.out.println("TailMap: "+ treeMap.tailMap("B"));
        System.out.println("TailMap inclusive true: "+ treeMap.tailMap("B", true));
        System.out.println("TailMap inclusive false: "+ treeMap.tailMap("B", false));

        treeMap.descendingKeySet().forEach(System.out::println);

        System.out.println("-------------------------------------\n");
        NavigableSet<String> strings = treeMap.descendingKeySet();
        strings.forEach(System.out::println);

    }
}
