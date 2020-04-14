package com.ehi.designPattren.StructuralPattern.AdapterPattern.media.impl;

import com.ehi.designPattren.StructuralPattern.AdapterPattern.media.AdvancedMediaPlayer;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:07
 * @Description: TODO
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }

}
