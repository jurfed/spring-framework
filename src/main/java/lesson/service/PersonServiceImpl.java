package lesson.service;


import lesson.dao.PersonDao;
import lesson.dao.PersonDaoSimple;
import lesson.domain.Person;

public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    public PersonServiceImpl(PersonDao personDao) {
        this.dao = personDao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}






