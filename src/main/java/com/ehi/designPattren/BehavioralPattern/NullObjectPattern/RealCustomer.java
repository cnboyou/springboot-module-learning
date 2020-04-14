package com.ehi.designPattren.BehavioralPattern.NullObjectPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:37
 * @Description: TODO
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
