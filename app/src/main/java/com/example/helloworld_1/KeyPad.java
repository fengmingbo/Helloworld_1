package com.example.helloworld_1;

public class KeyPad {
    public Command playCommand;
    public Command stopCommand;
    public Command rewindCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }
    public void setStopCommand(Command stopCommand){
        this.stopCommand=stopCommand;
    }
    public void setRewindCommand(Command rewindCommand){
        this.rewindCommand=rewindCommand;
    }

    public void play(){
        playCommand.excute();
    }
    public void stop(){
        stopCommand.excute();
    }
    public void rewind(){
        rewindCommand.excute();
    }
}
