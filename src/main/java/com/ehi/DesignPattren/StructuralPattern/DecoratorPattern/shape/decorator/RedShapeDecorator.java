package com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.decorator;

import com.ehi.DesignPattren.StructuralPattern.DecoratorPattern.shape.Shape;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:38
 * @Description: TODO
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }

}
