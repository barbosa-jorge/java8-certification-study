package com.java.study;

public class LocalClassExample {

    private String classField = "Class field";
    private static String classStaticField = "Class static field";

    public void methodA() {
        System.out.println("calling method A");
    }

    public static void methodStaticB() {
        System.out.println("calling static method B");
    }

     public void method() {

        String variable = "local variable";
        /**
         *  Can access all class members
         *  Can only have abstract or final class access modifier..
         *  Cannot have static members within it, except constant variable of String and primitive types
         *  Local variable must be final or effectively final.
         */

        class LocalClass {

            private static final String CONSTANT = "Constant value";
            private String localClassField = "local class field value";

            public void localClassMethod() {
                System.out.println("Class field: " + classField);
                System.out.println("Class static field: " + classStaticField);
                System.out.println("Local Class field: " + localClassField);
                System.out.println("method local variable:  " + variable); // you can access, but not change the variable value
                methodA();
                methodStaticB();
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.localClassField = "local class field value changed";
        localClass.localClassMethod();

    }

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();
        localClassExample.method();
    }

}
