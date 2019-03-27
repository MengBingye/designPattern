package com.design.pattern.filter;

import java.util.List;

/**
 * @create: 2019/03/27 21:36
 */

public interface Criteria {
     List<Person> meetCriteria(List<Person> persons);

}
