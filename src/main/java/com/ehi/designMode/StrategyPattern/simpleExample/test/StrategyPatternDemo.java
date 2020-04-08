package com.ehi.designMode.StrategyPattern.simpleExample.test;

import com.ehi.designMode.StrategyPattern.simpleExample.strategy.context.Context;
import com.ehi.designMode.StrategyPattern.simpleExample.strategy.impl.OperationAdd;
import com.ehi.designMode.StrategyPattern.simpleExample.strategy.impl.OperationSub;

/**
 * ClassName: StrategyPatternDemo
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:52
 * @Description: TODO
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    }
}