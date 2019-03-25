package com.design.pattern.adapter;

/**
 * 创建一个音频播放器
 * @create: 2019/03/25 09:58
 */
public interface MediaPlayer {

    /**
     *
     * @param audioType 类型
     * @param fileName 文件名称
     */
    void play(String audioType,String fileName);
}
