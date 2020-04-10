package com.ehi.DesignPattren.StructuralPattern.FilterPattern;

import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.Criteria;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.CriteriaFemale;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.CriteriaMale;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.CriteriaSingle;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.impl.AndCriteria;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.filter.impl.OrCriteria;
import com.ehi.DesignPattren.StructuralPattern.FilterPattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/10 10:46
 * @Description: TODO
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
