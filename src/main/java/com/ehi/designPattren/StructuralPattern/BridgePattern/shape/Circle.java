package com.ehi.designPattren.StructuralPattern.BridgePattern.shape;

import com.ehi.designPattren.StructuralPattern.BridgePattern.DrawApi;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:59
 * @Description: TODO
 */
public class Circle extends Shape {

    int x, y, radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }

}
