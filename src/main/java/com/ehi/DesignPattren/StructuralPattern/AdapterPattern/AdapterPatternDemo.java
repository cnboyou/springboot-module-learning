package com.ehi.DesignPattren.StructuralPattern.AdapterPattern;

import com.ehi.DesignPattren.StructuralPattern.AdapterPattern.media.adapter.AudioPlayer;

/**
 * ClassName: as
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:11
 * @Description: TODO
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
