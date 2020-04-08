package com.ehi.designMode.StrategyPattern.example2.strategy;

/**
 * ClassName: aa
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 11:58
 * @Description: TODO
 */
public interface UserPayStrategy {

    /**
     * 计算应付价格
     */
    public double quote(double orderPrice);
}
