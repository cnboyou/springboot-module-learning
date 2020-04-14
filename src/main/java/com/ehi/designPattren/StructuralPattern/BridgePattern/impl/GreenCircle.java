package com.ehi.designPattren.StructuralPattern.BridgePattern.impl;

import com.ehi.designPattren.StructuralPattern.BridgePattern.DrawApi;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:58
 * @Description: TODO
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}

