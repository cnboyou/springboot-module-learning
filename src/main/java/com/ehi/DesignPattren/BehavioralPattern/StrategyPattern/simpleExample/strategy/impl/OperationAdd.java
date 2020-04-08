package com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.simpleExample.strategy.impl;

import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.simpleExample.strategy.Strategy;

/**
 * ClassName: OperationAdd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:50
 * @Description: TODO
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}