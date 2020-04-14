package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.producer;

import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.factory.AbstractFactory;
import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.factory.ColorFactory;
import com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.factory.ShapeFactory;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:47
 * @Description: TODO
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }

        if ("shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }

}
