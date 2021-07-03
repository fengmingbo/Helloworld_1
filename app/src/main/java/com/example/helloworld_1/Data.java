package com.example.helloworld_1;

import android.util.Log;

public class Data {
    private static final String TAG = "Data";
    private int id;
    private String str;
    public void setId(int id){
        this.id=id;
    }
    public void setStr(String str){
        this.str=str+id;
    }
    public void print(){
        Log.d(TAG,str);
    }
}
