package com.ehi.designPattren.StructuralPattern.AdapterPattern.media.impl;

import com.ehi.designPattren.StructuralPattern.AdapterPattern.media.AdvancedMediaPlayer;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:08
 * @Description: TODO
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
