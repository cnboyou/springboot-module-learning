package com.ehi.designMode.BuilderPattern.model;

import com.ehi.designMode.BuilderPattern.service.impl.ColdDrink;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:14
 * @Description: TODO
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }

}
