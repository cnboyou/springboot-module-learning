package com.ehi.designPattren.BehavioralPattern.ChainOfResponsibilityPattern;

/**
 * ClassName: J
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 14:54
 * @Description: TODO
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}

