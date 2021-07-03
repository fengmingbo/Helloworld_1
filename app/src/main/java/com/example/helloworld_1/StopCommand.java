package com.example.helloworld_1;

public class StopCommand implements Command {
    AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer=audioPlayer;
    }
    @Override
    public void excute() {
        audioPlayer.stop();
    }
}
