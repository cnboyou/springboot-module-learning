package com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter;

import com.ehi.DesignPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ss
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:44
 * @Description: TODO
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }

}
