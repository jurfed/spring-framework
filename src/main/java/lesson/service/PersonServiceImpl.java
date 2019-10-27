package lesson.service;


import lesson.dao.PersonDao;
import lesson.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonServiceImpl implements PersonService {


    String persinName;

    public PersonServiceImpl(String name){
        persinName = name;
    }

    // @Autowired//- аналог inject. присвоит созданный объект без сеттера и конструктора
    private PersonDao dao;

/*    public PersonServiceImpl(PersonDao dao) {
        System.out.println("constructor PersonServiceImpl");
        this.dao = dao;
    }*/

/*    @Autowired //Autowired - аналог inject
    public void bla_bla_bla(PersonDao dao) {
        this.dao = dao;
    }*/

    @Autowired //Autowired - аналог inject
//    public void setDao(@Qualifier("personDaoId1") PersonDao dao) {
    public void setDao(@Qualifier("personDaoId2") PersonDao dao) {
        this.dao = dao;
        System.out.println(dao.getStr());
    }

    public Person getByName(String name) {
//        return dao.findByName(name);
        return dao.findByName(persinName);
    }
}






