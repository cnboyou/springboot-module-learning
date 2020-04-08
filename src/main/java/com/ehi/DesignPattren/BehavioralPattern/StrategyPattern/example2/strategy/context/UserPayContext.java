package com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.context;

import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.UserPayStrategy;

/**
 * ClassName: UserPayContext
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 12:08
 * @Description: TODO
 */
public class UserPayContext {

    private UserPayStrategy userPayStrategy;

    public UserPayContext(UserPayStrategy userPayStrategy) {
        this.userPayStrategy = userPayStrategy;
    }

    public double excuteUserPayContext(double orderPrice) {
        return userPayStrategy.quote(orderPrice);

    }
}