package com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.impl;

import com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.Shape;

/**
 * ClassName: Js
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:37
 * @Description: TODO
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

}
