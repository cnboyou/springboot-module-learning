package com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.impl;

import com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.Item;
import com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.Packing;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:10
 * @Description: TODO
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
