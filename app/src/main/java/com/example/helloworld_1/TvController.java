package com.example.helloworld_1;

public class TvController implements Controller {

    private TvState tvState;

    public TvController(TvState tvState){
        this.tvState=tvState;
    }

    @Override
    public void nextChannel() {
        tvState.nextChannel();
    }

    @Override
    public void prevChannel() {
        tvState.prevChannel();
    }

    @Override
    public void turnUp() {
        tvState.turnUp();
    }

    @Override
    public void turnOff() {
        tvState.turnDown();
    }
}
