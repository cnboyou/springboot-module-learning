package com.ehi.designPattren.CreatePattern.PrototypePattern;

import com.ehi.designPattren.CreatePattern.PrototypePattern.shape.Shape;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:59
 * @Description: TODO
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
