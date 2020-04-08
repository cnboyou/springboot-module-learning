package com.ehi.DesignPattren.BehavioralPattern.TemplatePattern.test;

import com.ehi.DesignPattren.BehavioralPattern.TemplatePattern.Cricket;
import com.ehi.DesignPattren.BehavioralPattern.TemplatePattern.Football;
import com.ehi.DesignPattren.BehavioralPattern.TemplatePattern.template.Game;

/**
 * ClassName: as
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 14:46
 * @Description: TODO
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }

}
