package com.java.study;

public class StaticInnerClassExample {

    private String outerField = "outer field value";
    private static String outerStaticField = "outer field static value";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public static void outerStaticMethod() {
        System.out.println("Outer static method");
    }

    public static class Inner {

        /**
        * Cannot access outer class instance members
         **/

        private String innerField = "inner field value";
        private static String innerStaticField = "inner field value";
        private static final String INNER_CONSTANT = "Inner constant";
        private static final int PRIMITIVE_INNER_CONSTANT = 1;
        private static final Long LONG_WRAPPER_INNER_CONSTANT = 1L;

        public void innerMethod() {
            System.out.println("Inner method accessing inner field: "+ innerField);
            System.out.println("Inner method accessing inner static field: "+ innerStaticField);
            System.out.println("Inner method accessing outer field: "+ outerStaticField);
            outerStaticMethod();
        }

        public static void innerStaticMethod() {
            System.out.println("Inner method accessing inner static field: "+ innerStaticField);
            System.out.println("Inner method accessing outer field: "+ outerStaticField);
            outerStaticMethod();
        }
    }

    public static void main(String[] args) {

        StaticInnerClassExample.Inner inner = new StaticInnerClassExample.Inner();
        inner.innerMethod();
        StaticInnerClassExample.Inner.innerStaticMethod();

    }
}
