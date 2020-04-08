package com.ehi.DesignPattren.CreatePattern.BuilderPattern.model;

import com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.impl.Burger;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:13
 * @Description: TODO
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
