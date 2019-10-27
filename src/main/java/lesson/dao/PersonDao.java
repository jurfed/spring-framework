package lesson.dao;

import lesson.domain.Person;

public interface PersonDao {

    Person findByName(String name);

    public String getStr();
}
