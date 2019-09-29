package lesson;

import lesson.domain.Person;
import lesson.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
        PersonService s = context.getBean(PersonService.class);
        Person person = s.getByName("Petro");
        System.out.println(person);
    }
}
