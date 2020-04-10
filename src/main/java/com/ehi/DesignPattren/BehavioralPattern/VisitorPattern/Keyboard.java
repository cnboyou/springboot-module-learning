package com.ehi.DesignPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: Ja
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:07
 * @Description: TODO
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
