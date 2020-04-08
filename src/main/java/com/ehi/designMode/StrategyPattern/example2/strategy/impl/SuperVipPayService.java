package com.ehi.designMode.StrategyPattern.example2.strategy.impl;

import com.ehi.designMode.StrategyPattern.example2.factory.UserPayServiceStrategyFactory;
import com.ehi.designMode.StrategyPattern.example2.strategy.UserPayStrategy;
import org.springframework.beans.factory.InitializingBean;

/**
 * ClassName: ssdd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 12:01
 * @Description: TODO
 */
public class SuperVipPayService implements UserPayStrategy,InitializingBean {

    @Override
    public double quote(double orderPrice) {
        return orderPrice * 0.8;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("SuperVip",this);
    }
}