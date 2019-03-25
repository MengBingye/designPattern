package com.design.pattern.adapter;

/**
 * @create: 2019/03/25 10:03
 */

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void PlayMp4(String fileName) {

    }
}
