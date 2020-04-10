package com.ehi.DesignPattren.StructuralPattern.FilterPattern.model;

/**
 * ClassName: aa
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:42
 * @Description: TODO
 */
public class Person {

    private String name;

    private String gender;

    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
