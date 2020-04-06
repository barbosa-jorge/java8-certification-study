package com.java.study;

public class InnerClassExample {

    private String outerField = "outer field value";
    private static String outerStaticField = "outer field static value";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public static void outerStaticMethod() {
        System.out.println("Outer static method");
    }

    public class Inner {

        /**
         * Static members are not allowed within non-static Inner Classes, except constant variable (primitives and String)
         * You can access all members of outer class, including the static ones.
         */

        private String innerField = "inner field value";
        private static final String INNER_CONSTANT = "Inner constant";
        private static final int PRIMITIVE_INNER_CONSTANT = 1;

        public void innerMethod() {
            System.out.println("Inner method accessing inner field: "+ innerField);
            System.out.println("Inner method accessing outer field: "+ outerField);
            System.out.println("Inner method accessing outer field: "+ outerStaticField);
            outerMethod();
            outerStaticMethod();
        }
    }

    public static void main(String[] args) {

        //InnerClassExample outer = new InnerClassExample();
        //InnerClassExample.Inner inner = outer.new InnerClassExample();

        InnerClassExample.Inner inner = new InnerClassExample().new Inner();
        inner.innerMethod();

    }
}
