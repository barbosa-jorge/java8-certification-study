package com.java.study.io;

import java.io.*;

public class BufferedReaderAndWritter {

    public static void main(String[] args) {

        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("/home/jorge/Desktop/bufferedFile.txt"))) {

            bufferedWriter.write("ola");
            bufferedWriter.newLine();
            bufferedWriter.write("c");
            bufferedWriter.newLine();
            bufferedWriter.write("abcdefgh",0,8);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/home/jorge/Desktop/bufferedFile.txt"))) {

            System.out.println("----------all lines-------------");
            bufferedReader.lines().forEach(System.out::println);

            System.out.println("---------------readline-------------");
            System.out.println("line: " + bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
