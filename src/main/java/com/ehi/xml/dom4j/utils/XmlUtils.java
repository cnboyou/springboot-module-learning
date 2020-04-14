package com.ehi.xml.dom4j.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: XmlUtils
 *
 * @Author: WangYiHai
 * @Date: 2020/4/13 11:54
 * @Description: TODO
 */
public class XmlUtils {

    /**
     * 加载xml文档
     * @param filePath
     * @return
     * @throws DocumentException
     */
    public static Document loadDocument(String filePath) throws DocumentException {
        //1.创建Reader对象
        SAXReader reader = new SAXReader();
        //2.创建kml文件
        File file = new File(filePath);
        //3.加载xml
        return reader.read(file);
    }

    /**
     * 创建KML文档对象
     * @return
     */
    public static Document createDocument() {
        return DocumentHelper.createDocument();
    }

    /**
     * 导出xml文件
     * @param document
     * @param storePath
     * @throws IOException
     */
    public static void exportXml(Document document, String storePath) throws IOException {
        //将kml写出本地
        OutputFormat format = OutputFormat.createPrettyPrint();
        //设置编码格式
        format.setEncoding("utf-8");
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(storePath),format);
        xmlWriter.write(document);
        xmlWriter.close();
    }

}