package com.ehi.designPattren.BehavioralPattern.ObserverPattern;

/**
 * ClassName: Js
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:21
 * @Description: TODO
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
