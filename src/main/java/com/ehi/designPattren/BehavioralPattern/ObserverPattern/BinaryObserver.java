package com.ehi.designPattren.BehavioralPattern.ObserverPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:21
 * @Description: TODO
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }

}
