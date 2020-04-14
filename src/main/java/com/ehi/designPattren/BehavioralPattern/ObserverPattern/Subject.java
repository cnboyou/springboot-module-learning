package com.ehi.designPattren.BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;


/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:19
 * @Description: TODO
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
