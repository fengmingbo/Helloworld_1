package com.example.helloworld_1;

import android.util.Log;

public class PngReader implements Reader {
    private static final String TAG = "PngReader";

    @Override
    public void read() {
        Log.d(TAG,"PngReader");
    }
}
