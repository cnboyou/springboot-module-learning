package com.ehi.designPattren.StructuralPattern.FilterPattern.filter.impl;

import com.ehi.designPattren.StructuralPattern.FilterPattern.filter.Criteria;
import com.ehi.designPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.List;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:46
 * @Description: TODO
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> other = otherCriteria.meetCriteria(persons);

        for (Person person : other) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }

        return first;
    }

}
