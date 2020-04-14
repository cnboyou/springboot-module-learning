package com.ehi.designPattren.StructuralPattern.FacadePattern.shape.impl;

import com.ehi.designPattren.StructuralPattern.FacadePattern.shape.Shape;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:21
 * @Description: TODO
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }

}
