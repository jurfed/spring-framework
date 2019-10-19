package lesson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson.dao")
public class PersonDaoConfig {

}
