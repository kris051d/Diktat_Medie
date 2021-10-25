package com.company;

public class Audio extends Medie implements Pause{

    @Override
    public void pause() {
        // sætte afspilning på pause
        System.out.println("lyden er stoppet");
    }
}
