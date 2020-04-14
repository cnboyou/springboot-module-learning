package com.ehi.designPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: K
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:07
 * @Description: TODO
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
