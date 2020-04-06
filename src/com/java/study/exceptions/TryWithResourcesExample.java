package com.java.study.exceptions;

import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        try(MyResource resource = new MyResource();) {
            throw new Exception("Exception inside try!");
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Suppressed exception: "+e.getSuppressed()[0].getMessage());
        }

        try(MyResource2 resource2 = new MyResource2()) {
            throw new IOException("Exception inside try!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Suppressed exception: "+e.getSuppressed()[0].getMessage());
        }

    }
}
