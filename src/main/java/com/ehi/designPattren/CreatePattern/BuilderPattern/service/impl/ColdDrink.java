package com.ehi.designPattren.CreatePattern.BuilderPattern.service.impl;

import com.ehi.designPattren.CreatePattern.BuilderPattern.service.Item;
import com.ehi.designPattren.CreatePattern.BuilderPattern.service.Packing;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:11
 * @Description: TODO
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
