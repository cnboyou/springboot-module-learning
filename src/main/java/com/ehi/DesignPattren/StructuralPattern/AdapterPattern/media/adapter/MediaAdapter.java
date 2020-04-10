package com.ehi.DesignPattren.StructuralPattern.AdapterPattern.media.adapter;

import com.ehi.DesignPattren.StructuralPattern.AdapterPattern.media.AdvancedMediaPlayer;
import com.ehi.DesignPattren.StructuralPattern.AdapterPattern.media.impl.Mp4Player;
import com.ehi.DesignPattren.StructuralPattern.AdapterPattern.media.impl.VlcPlayer;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:08
 * @Description: TODO
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
