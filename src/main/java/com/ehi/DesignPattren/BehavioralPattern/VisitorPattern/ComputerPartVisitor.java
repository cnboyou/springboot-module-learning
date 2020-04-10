package com.ehi.DesignPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: Jq
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:08
 * @Description: TODO
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
