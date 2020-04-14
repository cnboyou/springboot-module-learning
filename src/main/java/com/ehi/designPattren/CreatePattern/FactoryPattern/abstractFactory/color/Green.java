package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.color;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:44
 * @Description: TODO
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fille() method.");
    }
}
