package com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.impl;

import com.ehi.DesignPattren.CreatePattern.BuilderPattern.service.Packing;

/**
 * ClassName: ds
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:10
 * @Description: TODO
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

}
