package com.ehi.DesignPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: Jd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:10
 * @Description: TODO
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
