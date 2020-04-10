package com.ehi.DesignPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:07
 * @Description: TODO
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
