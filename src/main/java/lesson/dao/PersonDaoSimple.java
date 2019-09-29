package lesson.dao;



import lesson.domain.Person;

public class PersonDaoSimple implements PersonDao {

    @Override
    public Person findByName(String name) {
       return new Person(name, 27);
    }
}