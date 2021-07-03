package com.example.helloworld_1;

import android.util.Log;

public class SecondLeader extends Leader {

    private static final String TAG ="SecondLeader" ;

    @Override
    public void handlerRequest(int num) {
        if(num>this.MIN&&num<this.MAX){
            Log.d(TAG,"SecondLeader已经处理请求");
            return ;
        }
        if(this.nextLeader!=null){
            nextLeader.handlerRequest(num);
        }else{
            Log.d(TAG,"审批拒绝");
        }

    }
}
