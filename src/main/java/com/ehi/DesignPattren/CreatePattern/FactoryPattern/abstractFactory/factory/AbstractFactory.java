package com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.factory;

import com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.color.Color;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:45
 * @Description: TODO
 */
public abstract class AbstractFactory {
    public abstract com.ehi.DesignPattren.CreatePattern.FactoryPattern.abstractFactory.shap.Shape getShape(String shape);
    public abstract Color getColor(String color);
}
