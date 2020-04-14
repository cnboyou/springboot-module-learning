package com.ehi.designPattren.StructuralPattern.FilterPattern.filter;

import com.ehi.designPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: a
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:44
 * @Description: TODO
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }

}
