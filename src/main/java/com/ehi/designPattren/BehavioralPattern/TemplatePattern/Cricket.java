package com.ehi.designPattren.BehavioralPattern.TemplatePattern;

import com.ehi.designPattren.BehavioralPattern.TemplatePattern.template.Game;

/**
 * ClassName: dd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:42
 * @Description: TODO
 */
public class Cricket extends Game {

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
