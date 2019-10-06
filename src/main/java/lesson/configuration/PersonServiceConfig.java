package lesson.configuration;


import lesson.dao.PersonDao;
import lesson.service.PersonService;
import lesson.service.PersonServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson.service")
public class PersonServiceConfig {
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }
}
