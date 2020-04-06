package com.java.study.io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterExample {
    public static void main(String[] args) {

        try(PrintWriter pw = new PrintWriter("/home/jorge/Desktop/pwFile.txt")) {
            pw.println("Jorge barbosa");
            pw.format("%s is %d years old \n", "Jorge", 34);
            pw.printf("%s is %d years old \n", "Jorge", 34);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(PrintWriter pw = new PrintWriter(System.out)) {
            pw.println("Jorge barbosa");
            pw.format("%s is %d years old \n", "Jorge", 34);
            pw.printf("%s is %d years old \n", "Jorge", 34);
            pw.flush();
        }
    }
}
