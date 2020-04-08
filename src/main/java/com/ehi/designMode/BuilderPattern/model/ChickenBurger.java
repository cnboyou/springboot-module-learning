package com.ehi.designMode.BuilderPattern.model;

import com.ehi.designMode.BuilderPattern.service.impl.Burger;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:13
 * @Description: TODO
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}
