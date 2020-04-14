package com.ehi.designPattren.StructuralPattern.DecoratorPattern;

import com.ehi.designPattren.StructuralPattern.DecoratorPattern.shape.Shape;
import com.ehi.designPattren.StructuralPattern.DecoratorPattern.shape.decorator.RedShapeDecorator;
import com.ehi.designPattren.StructuralPattern.DecoratorPattern.shape.impl.Circle;
import com.ehi.designPattren.StructuralPattern.DecoratorPattern.shape.impl.Rectangle;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:38
 * @Description: TODO
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }

}
