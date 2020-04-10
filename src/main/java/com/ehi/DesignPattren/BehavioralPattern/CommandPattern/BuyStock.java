package com.ehi.DesignPattren.BehavioralPattern.CommandPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:43
 * @Description: TODO
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.buy();
    }
}
