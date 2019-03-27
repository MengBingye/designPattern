package com.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @create: 2019/03/27 21:38
 */

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("SINGLE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
