package com.example.helloworld_1;

import android.util.Log;

public class PowerOffTvState implements TvState {
    private static final String TAG = "PowerOffTvState";

    @Override
    public void nextChannel() {
        Log.d(TAG,"关机状态，无响应");
    }

    @Override
    public void prevChannel() {
        Log.d(TAG,"关机状态，无响应");

    }

    @Override
    public void turnUp() {
        Log.d(TAG,"关机状态，无响应");

    }

    @Override
    public void turnDown() {
        Log.d(TAG,"关机状态，无响应");

    }
}
