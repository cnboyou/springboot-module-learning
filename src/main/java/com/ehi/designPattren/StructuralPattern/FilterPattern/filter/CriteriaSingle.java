package com.ehi.designPattren.StructuralPattern.FilterPattern.filter;

import com.ehi.designPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:45
 * @Description: TODO
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
