package com.ehi.designMode.BuilderPattern.service.impl;

import com.ehi.designMode.BuilderPattern.service.Item;
import com.ehi.designMode.BuilderPattern.service.Packing;

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
