package com.example.helloworld_1;

public abstract class Leader {
    protected static int MIN=2;
    protected static int MIDDLE=5;
    protected static int MAX=30;
    protected Leader nextLeader;
    public void setNextLeader(Leader nextLeader){
        this.nextLeader=nextLeader;
    }
    public abstract void handlerRequest(int num);
}
