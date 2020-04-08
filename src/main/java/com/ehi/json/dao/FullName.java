package com.ehi.json.dao;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 10:33
 * @Description: TODO
 */
public class FullName {
    private String firstName;
    private String middleName;
    private String lastName;

    public FullName() {
    }

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // 省略getter和setter

    @Override
    public String toString() {
        return "[firstName=" + firstName + ", middleName="
                + middleName + ", lastName=" + lastName + "]";
    }
}
