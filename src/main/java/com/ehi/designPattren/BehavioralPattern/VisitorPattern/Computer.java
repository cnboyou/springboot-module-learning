package com.ehi.designPattren.BehavioralPattern.VisitorPattern;

/**
 * ClassName: Jad
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:08
 * @Description: TODO
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
