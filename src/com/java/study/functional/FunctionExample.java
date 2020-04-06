package com.java.study.functional;

import java.util.function.*;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> functionStringLength = s -> s.length();
        System.out.println(functionStringLength.apply("jorge"));

        BiFunction<String, Long, String> functionNameAndAge = (s, l) -> "Name: " + s + " age: "+ l;
        System.out.println(functionNameAndAge.apply("jorge", 34L));

        LongFunction<String> functionPrimitiveLong = l -> "Jorge "+ l + " years old";
        System.out.println(functionPrimitiveLong.apply(34));

        ToLongFunction<String> functionObjToLong = o -> Long.parseLong(o);
        System.out.println(functionObjToLong.applyAsLong("35"));

        IntToDoubleFunction functionIntToDouble = i -> (double) i / 4;
        System.out.println(functionIntToDouble.applyAsDouble(10));

    }
}
