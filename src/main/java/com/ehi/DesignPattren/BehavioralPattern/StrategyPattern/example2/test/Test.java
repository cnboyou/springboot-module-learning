package com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.test;

import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.factory.UserPayServiceStrategyFactory;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.model.User;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.UserPayStrategy;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.context.UserPayContext;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.impl.ParticularlyVipPayService;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.impl.SuperVipPayService;
import com.ehi.DesignPattren.BehavioralPattern.StrategyPattern.example2.strategy.impl.VipPayService;

/**
 * ClassName: Test
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 12:13
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) {
        UserPayContext context = new UserPayContext(new ParticularlyVipPayService());
        System.out.println(context.excuteUserPayContext(50));

        UserPayContext context2 = new UserPayContext(new SuperVipPayService());
        System.out.println(context2.excuteUserPayContext(50));

        UserPayContext context3 = new UserPayContext(new VipPayService());
        System.out.println(context3.excuteUserPayContext(50));


        User user = new User();
        user.setVipType("Vip");
        calPrice(50,user);

    }

    public static double calPrice(double orderPrice, User user) {

        String vipType = user.getVipType();
        UserPayStrategy strategy = UserPayServiceStrategyFactory.getByUserType(vipType);
        return strategy.quote(orderPrice);
    }
}