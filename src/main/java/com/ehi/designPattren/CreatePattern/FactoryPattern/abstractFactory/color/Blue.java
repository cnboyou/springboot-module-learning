package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:45
 * @Description: TODO
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fille() method.");
    }
}
