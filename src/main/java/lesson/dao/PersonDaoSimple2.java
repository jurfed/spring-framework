package lesson.dao;


import lesson.domain.Person;
import org.springframework.stereotype.Service;

//@Component
//@Repository("personDaoId")
@Service("personDaoId2")
//@Controller
public class PersonDaoSimple2 implements PersonDao {

    String str="456";

    public String getStr() {
        return str;
    }

    public PersonDaoSimple2() {
        System.out.println("constructor PersonDaoSimple 2 " +str);
    }

    @Override
    public Person findByName(String name) {
        return new Person(name, 27);
    }
}