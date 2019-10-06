package lesson.service;


import lesson.dao.PersonDao;
import lesson.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {
    private PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        return dao.findByName(name);
    }
}






