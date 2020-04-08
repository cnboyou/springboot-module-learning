package com.ehi.designMode.BuilderPattern.model;

import com.ehi.designMode.BuilderPattern.service.impl.Burger;

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
