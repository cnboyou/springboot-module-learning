package com.ehi.designMode.BuilderPattern.service.impl;

import com.ehi.designMode.BuilderPattern.service.Item;
import com.ehi.designMode.BuilderPattern.service.Packing;

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
