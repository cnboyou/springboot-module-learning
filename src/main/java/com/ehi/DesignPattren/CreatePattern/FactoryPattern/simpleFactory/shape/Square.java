package com.ehi.DesignPattren.CreatePattern.FactoryPattern.simpleFactory.shape;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:40
 * @Description: TODO
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
