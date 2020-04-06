package com.java.study.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Consumer example
        Consumer<String> consumerUpperCase = s -> System.out.println(s.toUpperCase());
        consumerUpperCase.accept("Jorge");

        // BiConsumer example
        BiConsumer<String, Long> biConsumerNameAndAge = (s, l) -> System.out.println("Name: "+ s + " and age: " + l);
        biConsumerNameAndAge.accept("Jorge", 34L);

        // Calling two consumers using andThen example
        class Item {
            String status;
            String description;

            Item(String status, String description) {
                this.description = description;
                this.status = status;
            }
        }

        Item item = new Item("Pending", "PENCIL");

        Consumer<Item> itemConsumerStatus = i -> i.status = "OK";
        Consumer<Item> itemConsumerNotify = i ->
                System.out.println("item of description: " + i.description + " and status: "+ i.status + " is done!" );

        itemConsumerStatus.andThen(itemConsumerNotify).accept(item);

        // primitive consumer example
        IntConsumer intConsumer = i -> {
            if (i% 2 ==0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        };

        intConsumer.accept(1);

    }
}
