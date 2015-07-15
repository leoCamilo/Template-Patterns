package com.company;

import cdp.MediaPlayer;

public class Main {

    public static void main(String[] args) {
        MediaPlayer itunes = new MediaPlayer();
        itunes.loadArq("Paulinho da viola volume IV");
        itunes.runAs("mp3");
        itunes.runAs("mp4");
        itunes.runAs("avi");
        itunes.endReproduction();
    }
}
