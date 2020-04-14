package com.ehi.file.xml.jaxb.test;

import com.ehi.file.xml.jaxb.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * ClassName: StudentTest
 *
 * @Author: WangYiHai
 * @Date: 2020/4/14 11:53
 * @Description: TODO
 */
public class SimpleTest {
    public static void main(String[] args) throws Exception {
        Student student = new Student("001","Tom",22);
        System.out.println("javaToXml-->>");
        javaToxml(student);

        System.out.println();
        System.out.println("xmlTojava-->>");
        xmlTojava();
    }

    /**
     * JAXB 转换对象必须属于JAXBElement类型，或者使用 @XmlRootElement注解
     * JAXB 转换对象必须拥有无参数构造器（默认存在，如果被覆盖，需要显示指定）
     * @param stu
     * @throws Exception
     */
    public static void javaToxml(Student stu) throws Exception {
        // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Student.class);
        // 创建 Marshaller 实例
        Marshaller marshaller = context.createMarshaller();
        // 设置转换参数 -> 这里举例是告诉序列化器是否格式化输出
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // 构建输出环境 -> 这里使用标准输出，输出到控制台Console
        PrintStream out = System.out;
        // 将所需对象序列化 -> 该方法没有返回值
        marshaller.marshal(stu, out);
    }

    /**
     * 可以有多种方式加载XML数据，从文件中加载只是其中的一种
     * getResourceAsStream("file.xml")方法需要将该XML文件放置于/resources目录下
     * @throws Exception
     */
    public static void xmlTojava() throws Exception {
        // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Student.class);
        // 创建 UnMarshaller 实例
        Unmarshaller unmarshaller = context.createUnmarshaller();
        // 加载需要转换的XML数据 -> 这里使用InputStream，还可以使用File，Reader等
        InputStream stream = SimpleTest.class.getClassLoader().getResourceAsStream("student.xml");
        // 将XML数据序列化 -> 该方法的返回值为Object基类，需要强转类型
        Student stu = (Student) unmarshaller.unmarshal(stream);
        // 将结果打印到控制台
        System.out.println(stu);
    }
}