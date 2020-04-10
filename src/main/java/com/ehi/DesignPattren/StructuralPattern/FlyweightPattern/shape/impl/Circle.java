package com.ehi.DesignPattren.StructuralPattern.FlyweightPattern.shape.impl;

import com.ehi.DesignPattren.StructuralPattern.FlyweightPattern.shape.Shape;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:29
 * @Description: TODO
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y : " + y + ", radius : " + radius);
    }

}
