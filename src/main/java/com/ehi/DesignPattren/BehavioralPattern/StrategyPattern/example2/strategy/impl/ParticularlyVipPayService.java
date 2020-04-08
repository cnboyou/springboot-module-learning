package com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.impl;

import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.factory.UserPayServiceStrategyFactory;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.UserPayStrategy;
import org.springframework.beans.factory.InitializingBean;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 12:00
 * @Description: TODO
 */
public class ParticularlyVipPayService implements UserPayStrategy,InitializingBean {

    @Override
    public double quote(double orderPrice) {
        if (orderPrice >= 30) {
            return 0.7 * orderPrice;
        }
        return orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("ParticularlyVip",this);
    }
}



