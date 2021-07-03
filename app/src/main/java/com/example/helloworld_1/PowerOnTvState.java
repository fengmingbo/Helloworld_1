package com.example.helloworld_1;

import android.util.Log;

public class PowerOnTvState implements TvState {
    private static final String TAG = "PowerOnTvState";

    @Override
    public void nextChannel() {
        Log.d(TAG,"下一个频道");
    }

    @Override
    public void prevChannel() {
        Log.d(TAG,"上一个频道");
    }

    @Override
    public void turnUp() {
        Log.d(TAG,"加大音量");
    }

    @Override
    public void turnDown() {
        Log.d(TAG,"减小音量");
    }
}
