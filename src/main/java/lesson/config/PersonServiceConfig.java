package lesson.config;


import lesson.service.PersonService;
import lesson.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:config1/myProperties.properties")
public class PersonServiceConfig {

    @Value("${person.name}")
    private String hello;

/*    @Bean
    public PersonService getPersonService(PersonDao myDao) {
//добавление PersonDaoSimple в PersonServiceImpl через конструктор PersonServiceImpl
        return new PersonServiceImpl(myDao);

    }*/

    @Bean
    public PersonService getPersonService() {

//  иначе PersonDaoSimple добавится PersonServiceImpl через переменную, помеченную @Autowired см PersonServiceImpl
        return new PersonServiceImpl(hello);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer getConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
