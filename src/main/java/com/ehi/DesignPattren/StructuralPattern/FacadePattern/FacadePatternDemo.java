package com.ehi.DesignPattren.StructuralPattern.FacadePattern;

import com.ehi.DesignPattren.StructuralPattern.FacadePattern.shape.facade.ShapeMaker;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 11:19
 * @Description: TODO
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
