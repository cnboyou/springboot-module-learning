package com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter;

import com.ehi.DesignPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.List;

/**
 * ClassName: d
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:43
 * @Description: 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
