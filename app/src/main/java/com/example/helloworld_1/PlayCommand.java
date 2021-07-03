package com.example.helloworld_1;

public class PlayCommand implements Command {
    AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer=audioPlayer;
    }
    @Override
    public void excute() {
        audioPlayer.play();
    }
}
