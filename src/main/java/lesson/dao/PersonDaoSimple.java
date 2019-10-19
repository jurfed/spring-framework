package lesson.dao;


import lesson.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Repository("personDaoId")
@Service("personDaoId")
//@Controller
public class PersonDaoSimple implements PersonDao {

    String str="123";

    public PersonDaoSimple() {
        System.out.println("constructor PersonDaoSimple 1 " +str);
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, 27);
    }
}