package com.ehi.DesignPattren.StructuralPattern.FlyweightPattern.shape.factory;

import com.ehi.DesignPattren.StructuralPattern.FlyweightPattern.shape.Shape;
import com.ehi.DesignPattren.StructuralPattern.FlyweightPattern.shape.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:29
 * @Description: TODO
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }


}
