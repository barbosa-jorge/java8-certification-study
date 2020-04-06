package com.java.study.io;

import java.io.Console;
import java.util.Arrays;

public class SystemConsoleExample {
    public static void main(String[] args) {

        Console console = System.console();
        if (console != null) {
            console.writer().println("Enter your name:");
            String name = console.readLine();
            System.out.println("entered name: "+ name);

            console.writer().println("Enter your password:");
            char[] password = console.readPassword();
            System.out.println("entered password: "+password.toString());
            Arrays.fill(password,'x');

        }

    }
}
