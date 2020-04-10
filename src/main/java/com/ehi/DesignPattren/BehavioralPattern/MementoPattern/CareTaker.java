package com.ehi.DesignPattren.BehavioralPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:50
 * @Description: Caretaker 对象负责从 Memento 中恢复对象的状态。
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}