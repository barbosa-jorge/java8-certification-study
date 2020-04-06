package com.java.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStreams {
    public static void main(String[] args) {
//        System.out.println("Enter a character...");
//        try {
//            int read = System.in.read();
//            System.out.println((char)read);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name...");
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
