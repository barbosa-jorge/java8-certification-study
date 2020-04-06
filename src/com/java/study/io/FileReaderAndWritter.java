package com.java.study.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWritter {
    public static void main(String[] args) {

        String text = "This is a example text.";
        char[] chars = new char[] {'a','b','c','d','e'};

        File file = new File("/home/jorge/Desktop/file-write-read.txt");
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(chars);
            fileWriter.append(" ").append(text);
        } catch(IOException e) {
            e.printStackTrace();
        }

        char[] chars2 = new char[30];
        try(FileReader fileReader = new FileReader(file)) {

            System.out.println("------------- one by one ---------");int c;
            while((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println("");
            System.out.println("------------- read and populate array ---------");
            int c1 = fileReader.read(chars2);
            while((c1 = fileReader.read(chars2)) != -1) {

            }
            for (int ch : chars2) {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
