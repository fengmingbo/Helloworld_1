package com.example.helloworld_1;

public class PngReaderFactory implements Factory{

    @Override
    public Reader getReader() {

        return new PngReader();
    }
}
