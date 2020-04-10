package com.ehi.DesignPattren.StructuralPattern.BridgePattern.shape;

import com.ehi.DesignPattren.StructuralPattern.BridgePattern.DrawApi;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:59
 * @Description: TODO
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();

}
