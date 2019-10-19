package lesson;

import lesson.config.PersonDaoConfig;
import lesson.config.PersonServiceConfig;
import lesson.domain.Person;
import lesson.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(PersonDaoConfig.class);
        context.register(PersonServiceConfig.class);
        context.refresh();

        PropertySourcesPlaceholderConfigurer t = context.getBean(PropertySourcesPlaceholderConfigurer.class);


        PersonService s = context.getBean(PersonService.class);
        Person person = s.getByName("Petro");
        System.out.println(person);

    }
}
