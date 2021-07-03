package com.example.helloworld_1;

public class Danli {
    private volatile static Danli instance;
    //构造函数私有化，防止其他类手动new
    private Danli(){}
    public Danli getInstance(){
        if(instance==null){
            synchronized (Danli.class){
                if(instance==null)
                instance=new Danli();
            }
        }
        return instance;
    }
}
