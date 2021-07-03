package com.example.helloworld_1;

public class DataBuilder {
    private int id;
    private String str;
    public DataBuilder setId(int id){
        this.id=id;
        return this;
    }
    public DataBuilder setStr(String str){
        this.str=str;
        return this;
    }
    public Data build(){
        Data data=new Data();
        data.setId(id);
        data.setStr(str);
        return data;
    }
}
