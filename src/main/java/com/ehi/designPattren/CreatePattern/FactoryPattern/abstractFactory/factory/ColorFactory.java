package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.factory;

import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color.Blue;
import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color.Color;
import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color.Green;
import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color.Red;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:46
 * @Description: TODO
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        color = color.toLowerCase();
        switch (color) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }

}
