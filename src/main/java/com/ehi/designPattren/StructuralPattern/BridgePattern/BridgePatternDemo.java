package com.ehi.designPattren.StructuralPattern.BridgePattern;

import com.ehi.designPattren.StructuralPattern.BridgePattern.impl.GreenCircle;
import com.ehi.designPattren.StructuralPattern.BridgePattern.impl.RedCircle;
import com.ehi.designPattren.StructuralPattern.BridgePattern.shape.Circle;
import com.ehi.designPattren.StructuralPattern.BridgePattern.shape.Shape;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:00
 * @Description: TODO
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
