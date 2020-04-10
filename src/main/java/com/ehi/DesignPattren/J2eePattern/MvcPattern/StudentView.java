package com.ehi.DesignPattren.J2eePattern.MvcPattern;

/**
 * ClassName: Jd
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 15:09
 * @Description: TODO
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }

}
