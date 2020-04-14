package com.ehi.designPattren.BehavioralPattern.StrategyPattern.simpleExample.strategy.impl;

import com.ehi.designPattren.BehavioralPattern.StrategyPattern.simpleExample.strategy.Strategy;

/**
 * ClassName: OperationSub
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:50
 * @Description: TODO
 */
public class OperationSub implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}