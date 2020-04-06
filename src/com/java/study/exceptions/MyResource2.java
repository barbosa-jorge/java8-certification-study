package com.java.study.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class MyResource2 implements Closeable {

    @Override
    public void close() throws IOException {
        throw new IOException("IOException threw inside close method!");
    }
}
