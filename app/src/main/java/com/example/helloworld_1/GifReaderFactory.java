package com.example.helloworld_1;

public class GifReaderFactory implements Factory{

    @Override
    public Reader getReader() {
        return GifReader.getInstance();
    }
}
