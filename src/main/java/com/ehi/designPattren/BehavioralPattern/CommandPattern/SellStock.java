package com.ehi.designPattren.BehavioralPattern.CommandPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:43
 * @Description: TODO
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
