package com.ehi.designPattren.CreatePattern.FactoryPattern.simpleFactory.shape;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:40
 * @Description: TODO
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
