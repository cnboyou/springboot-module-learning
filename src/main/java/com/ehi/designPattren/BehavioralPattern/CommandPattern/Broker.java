package com.ehi.designPattren.BehavioralPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:43
 * @Description: 创建命令调用类。
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
