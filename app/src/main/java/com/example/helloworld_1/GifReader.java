package com.example.helloworld_1;

import android.util.Log;

public class GifReader implements Reader {

    private static final String TAG = "GifReader";

    private volatile static GifReader instance;

    private GifReader(){};

    @Override
    public void read() {
        Log.d(TAG,"gifReader");
    }

    public static GifReader getInstance(){
        if(instance==null){
            synchronized (GifReader.class){
                if(instance==null)
                    instance=new GifReader();
            }
        }
        return instance;
    }

}
