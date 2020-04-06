package com.java.study.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExamples {

    public static void main(String[] args) {

        File file = new File("/home/jorge/Desktop/file.txt");

        System.out.println("exists: " + file.exists());
        System.out.println("absolute path: " +file.getAbsolutePath());
        System.out.println("absolute file: " +file.getAbsoluteFile());
        System.out.println("file name: " +file.getName());
        System.out.println("parent: " +file.getParent());
        System.out.println("path: " +file.getPath());
        System.out.println("is absolute: " +file.isAbsolute());
        System.out.println("is directory: " +file.isDirectory());
        System.out.println("to path: " +file.toPath());

        File file2 = new File("/home/jorge/Desktop/file2.txt");
        try {
            System.out.println("mkdir: " +file2.createNewFile());
        } catch (IOException e ){
        }

        System.out.println("equals: " +file.equals(file2));


        File dir = new File("/home/jorge/Desktop/dir/");
        System.out.println("mkdirs: " +dir.mkdirs());

        File dir2 = new File("/home/jorge/Desktop/dir2/dir3");
        System.out.println("mkdirs: " +dir.mkdirs());

        File file3 = new File(dir, "file3.txt");
        System.out.println("exists: "+ file3.exists());
        try{
            file3.createNewFile();
        } catch (IOException e) {
        }
        System.out.println("exists: "+ file3.exists());
        Arrays.stream(dir.list()).forEach(System.out::println);
        Arrays.stream(dir.listFiles()).forEach(System.out::println);

        System.out.println("delete file: " +file.delete());
        System.out.println("delete file2: " +file2.delete());
        System.out.println("delete file2: " +file3.delete());

        System.out.println("delete dir: " + dir.delete());
        System.out.println("delete dir: " + dir2.delete());

    }

}
