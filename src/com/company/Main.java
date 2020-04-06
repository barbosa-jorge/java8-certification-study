package com.company;

public class Main {

    private String field;
    private static String staticField;

    public class Inner {
        String a = field;
        String b = staticField;

        public void innerClassMethod() {
            System.out.println("inner class method call: ");
        }
    }

    public static class InnerStatic {
        public void innerStaticClassMethod() {
            System.out.println("inner static class method call: " + staticField);
        }
    }

    public void methodA() {
        System.out.println("MethodA");
    }

    public static void staticMethod() {
        System.out.println("static Method");
    }

    public static void main(String[] args) {

        Main main = new Main();
        Main.Inner inner = main.new Inner();
        inner.innerClassMethod();

        Main.InnerStatic innerStatic = new Main.InnerStatic();
        innerStatic.innerStaticClassMethod();

    }
}