package com.ehi.DesignPattren.StructuralPattern.FacadePattern.shape.impl;

import com.ehi.DesignPattren.StructuralPattern.FacadePattern.shape.Shape;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:20
 * @Description: TODO
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
