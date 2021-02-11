package javaFX.autoStartMedia;

import jaco.mp3.player.MP3Player;

import java.io.File;

public class Example {

    public static void main(String[] args) throws Exception {

        // MP3Player.setDefaultUI(MP3PlayerUICompact.class);

        MP3Player player = new MP3Player();

        player.setRepeat(true);
        player.setShuffle(true);

        player.addToPlayList(new File("D://track.mp3"));
        player.addToPlayList(new File("D://track.mp3"));
        player.addToPlayList(new File("D://track.mp3"));

        player.play();
    }

}

