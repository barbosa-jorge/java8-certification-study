package com.java.study.functional;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class SupplierExample {

    public static void main(String[] args) {

        IntSupplier intSupplier = () -> Integer.parseInt("1000");
        int asInt = intSupplier.getAsInt();
        System.out.println("generated int: " + asInt);

        BooleanSupplier booleanSupplier = () -> Boolean.parseBoolean("true");
        System.out.println("generated boolean: "+booleanSupplier.getAsBoolean());

    }
}
