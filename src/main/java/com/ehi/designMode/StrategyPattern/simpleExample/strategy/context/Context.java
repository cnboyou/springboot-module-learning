package com.ehi.designMode.StrategyPattern.simpleExample.strategy.context;

import com.ehi.designMode.StrategyPattern.simpleExample.strategy.Strategy;

/**
 * ClassName: Context
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:51
 * @Description: TODO
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1,num2);
    }
}