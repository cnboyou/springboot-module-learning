package com.ehi.log.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:46
 * @Description: TODO
 */

public class Log4jTest1 {
    public static void main(String[] args) {

        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
        File file = new File("opt/demo/log4j2.xml");
        loggerContext.setConfigLocation(file.toURI());

    }
}