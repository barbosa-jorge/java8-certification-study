package com.java.study.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExample {

    public static void main(String[] args) {

//        try {
//            //throw new MyException("exception");
//            throw new MyRuntimeException("exception");
//        } finally {
//            System.out.println("finally block");
//        }

        try{
            try {
                throw new Exception("Exception from inside try block...");
            } catch (Exception e) {
                throw new Exception("Exception thrown inside catch block...");
            } finally {
                System.out.println("first Finally block");
            }
        } catch (Exception e){
            System.out.println("Second catch!");
        } finally {
            System.out.println("Second finally!");
        }



    }

}
