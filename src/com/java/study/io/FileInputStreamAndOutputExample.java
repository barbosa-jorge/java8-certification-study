package com.java.study.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamAndOutputExample {

    public static void main(String[] args) {

        File file = new File("/home/jorge/Desktop/teste.txt");

        byte[] bytes = new byte[10];

        try(FileInputStream fileInputStream = new FileInputStream(file)) {

            int b;
            int counter = 0;
            while((b = fileInputStream.read()) != -1) {
                System.out.println(b);
                bytes[counter] = (byte) b;
                counter++;
                //System.out.println((char) b); // converting bytes to char
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileOutputStream write bytes
        File outputFile = new File("/home/jorge/Desktop/teste-output.txt");
        outputFile.delete();
        try {
            outputFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
