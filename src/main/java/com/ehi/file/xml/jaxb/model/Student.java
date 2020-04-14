package com.ehi.file.xml.jaxb.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName: Student
 *
 * @Author: WangYiHai
 * @Date: 2020/4/14 11:50
 * @Description: TODO
 */
@XmlRootElement
public class Student {

    private String id;
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}