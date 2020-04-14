package com.ehi.designPattren.CreatePattern.BuilderPattern.service.impl;

import com.ehi.designPattren.CreatePattern.BuilderPattern.service.Packing;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:10
 * @Description: TODO
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }

}
