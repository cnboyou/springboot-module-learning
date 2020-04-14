package com.ehi.designPattren.StructuralPattern.FilterPattern.filter.impl;

import com.ehi.designPattren.StructuralPattern.FilterPattern.filter.Criteria;
import com.ehi.designPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.List;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:45
 * @Description: TODO
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(list);
    }

}
