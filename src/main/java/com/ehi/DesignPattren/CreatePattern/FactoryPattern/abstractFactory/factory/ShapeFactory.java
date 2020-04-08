package com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.factory;

import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.color.Color;
import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Circle;
import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Rectangle;
import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Shape;
import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Square;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:46
 * @Description: TODO
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        shape = shape.toLowerCase();

        switch (shape) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }

    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
