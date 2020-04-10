package com.ehi.DesignPattren.StructuralPattern.BridgePattern.impl;

import com.ehi.DesignPattren.StructuralPattern.BridgePattern.DrawApi;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:58
 * @Description: TODO
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
