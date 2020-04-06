package com.java.study;

interface InterfaceA {
    void method();
}

public class AnonymousClassExample {

    private String classField = "class field value";
    private static String classStaticField = "class static field value";

    public void methodA() {
        System.out.println("Method A call");
    }

    public static void methodStaticA() {
        System.out.println("static Method A call");
    }

    public void method() {

        String localVariable = "local variable";

        /**
         *  Can access all class members
         *  Can only have abstract or final class access modifier.
         *  Cannot have static members within it, only constant variable of String and primitive types
         *  Local variable must be final or effectively final.
         */

        new InterfaceA() {

            private static final String CONSTANT = "Constant value";

            public void methodA() {
                System.out.println("method inside declaration");
            }

            @Override
            public void method() {
                System.out.println(localVariable);
                System.out.println(classField);
                System.out.println(classStaticField);
                methodA();
                methodStaticA();
            }
        }.method();

    }

    public static void main(String[] args) {
        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        anonymousClassExample.method();
    }

}
