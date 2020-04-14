package com.ehi.designPattren.BehavioralPattern.StatePattern;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 15:03
 * @Description: TODO
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
