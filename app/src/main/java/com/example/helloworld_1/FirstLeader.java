package com.example.helloworld_1;

import android.util.Log;

public class FirstLeader extends Leader {

    private static final String TAG ="FirstLeader" ;

    @Override
    public void handlerRequest(int num) {
        if(num<this.MIN){
            Log.d(TAG,"FirstLeader已经处理请求");
            return ;
        }
        if(this.nextLeader!=null){
            nextLeader.handlerRequest(num);
        }else{
            Log.d(TAG,"审批拒绝");
        }

    }
}
