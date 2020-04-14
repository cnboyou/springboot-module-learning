package com.ehi.designPattren.BehavioralPattern.TemplatePattern;

import com.ehi.designPattren.BehavioralPattern.TemplatePattern.template.Game;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:45
 * @Description: TODO
 */
public class Football extends Game {

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

}
