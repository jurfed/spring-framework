package lesson.service;

import lesson.domain.Person;

public interface PersonService {
    Person getByName(String name);
}
