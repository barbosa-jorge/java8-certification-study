package com.java.study.exceptions;

public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Exception threw inside close method!");
    }
}
