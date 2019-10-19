package lesson.config;


import lesson.dao.PersonDao;
import lesson.service.PersonService;
import lesson.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonServiceConfig {


/*    @Bean
    public PersonService getPersonService(PersonDao myDao) {
//добавление PersonDaoSimple в PersonServiceImpl через конструктор PersonServiceImpl
        return new PersonServiceImpl(myDao);

    }*/

    @Bean
    public PersonService getPersonService() {

//  иначе PersonDaoSimple добавится PersonServiceImpl через переменную, помеченную @Autowired см PersonServiceImpl
        return new PersonServiceImpl();
    }
}
