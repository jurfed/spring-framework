package lesson.configuration;

import lesson.dao.PersonDao;
import lesson.dao.PersonDaoSimple;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson.dao")
public class PersonDaoConfig {

    public PersonDao personDao(){
        return new PersonDaoSimple();
    }

}
