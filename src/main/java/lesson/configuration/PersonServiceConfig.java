package lesson.configuration;


import lesson.dao.PersonDao;
import lesson.service.PersonService;
import lesson.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonServiceConfig {

    @Bean
    public PersonService getPersonService(PersonDao myDao) {
        return new PersonServiceImpl(myDao);
    }
}
