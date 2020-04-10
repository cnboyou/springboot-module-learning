package com.ehi.DesignPattren.BehavioralPattern.StatePattern;

/**
 * ClassName: Js
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 15:03
 * @Description: TODO
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }

}
