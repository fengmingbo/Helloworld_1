package com.example.helloworld_1;

import android.util.Log;

public class AudioPlayer {
    private static final String TAG = "AudioPlayer";

    public void play(){
        Log.d(TAG,"播放...");
    }
    public void stop(){
        Log.d(TAG,"暂停...");

    }
    public void rewind(){
        Log.d(TAG,"倒放...");

    }
}
