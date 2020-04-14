package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:43
 * @Description: TODO
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fille() method.");
    }
}
