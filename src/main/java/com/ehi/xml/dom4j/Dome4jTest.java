package com.ehi.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/13 11:53
 * @Description: TODO
 */
public class Dome4jTest {

    public static void main(String[] args) throws DocumentException {
        // 1 创建核心对象（new 方式）
        SAXReader saxReader = new SAXReader();
        //2 加载xml文档 获得dom树（核心对象调用read读取xml文件）
        Document doc = saxReader.read("E:\\springbootProject\\springboot-module-learning\\src\\main\\resources\\test.xml");
        //3 获得根元素（文档对象下面就是根元素）
        Element root = doc.getRootElement();
        //4 获得子元素（根节点下所有子元素）
        List<Element> list = root.elements();

        for (Element e : list) {
            // elementText("标签名") 获得指定名称元素的文本值 （指定标签的文本值）
            // getName() 获得当前元素名
            if ("servlet".equals(e.getName())) {
                System.out.println(e.elementText("servlet-name"));
                System.out.println(e.getName());
            }

        }
    }

}
