package com.example.helloworld_1;

public class RewindCommand implements Command {
    AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer){
        this.audioPlayer=audioPlayer;
    }
    @Override
    public void excute() {
        audioPlayer.rewind();
    }
}
