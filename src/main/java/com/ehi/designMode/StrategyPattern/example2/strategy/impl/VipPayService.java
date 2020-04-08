package com.ehi.designMode.StrategyPattern.example2.strategy.impl;

import com.ehi.designMode.StrategyPattern.example2.factory.UserPayServiceStrategyFactory;
import com.ehi.designMode.StrategyPattern.example2.strategy.UserPayStrategy;
import org.springframework.beans.factory.InitializingBean;

/**
 * ClassName: sdaa
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 12:02
 * @Description: TODO
 */

public class VipPayService implements UserPayStrategy,InitializingBean {

    @Override
    public double quote(double orderPrice) {
        /*if(该用户超级会员刚过期并且尚未使用过临时折扣){
            临时折扣使用次数更新();
            returen 8折价格;
        }
        return 9折价格;*/
        return 0.9 * orderPrice;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UserPayServiceStrategyFactory.register("Vip",this);
    }
}