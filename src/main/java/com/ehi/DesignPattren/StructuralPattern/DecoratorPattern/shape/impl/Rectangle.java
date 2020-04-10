package com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.impl;

import com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.Shape;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:36
 * @Description: TODO
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

}
