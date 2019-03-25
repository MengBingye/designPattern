package com.design.pattern.adapter;

/**
 * 高级的媒体播放器
 * @create: 2019/03/25 10:01
 */
public interface AdvancedMediaPlayer {

    /**
     * 播放vlc
     * @param fileName
     */
    void playVlc(String fileName);

    /**
     * 播放Mp4
     * @param fileName
     */
    void PlayMp4(String fileName);
}
