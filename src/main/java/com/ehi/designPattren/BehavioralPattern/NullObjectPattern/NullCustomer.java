package com.ehi.designPattren.BehavioralPattern.NullObjectPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:37
 * @Description: TODO
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
