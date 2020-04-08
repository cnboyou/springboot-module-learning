package com.ehi.DesignPattren.CreatePattern.BuilderPattern.model;

import com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.impl.ColdDrink;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:14
 * @Description: TODO
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
