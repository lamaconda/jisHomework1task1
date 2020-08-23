package by.jrr.jis4.service;

import by.jrr.jis4.bean.Person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceTest {

    @Test
    public void ifAdultShouldReturnTrue() {
        Person person = new Person();
        person.setAge(18);

        PersonService personService = new PersonService(person);
        boolean expected = true;
        boolean actual = personService.ifAdult();

        assertEquals(expected, actual);


    }

    @Test
    public void ifAdultShouldReturnFalse() {
        Person person = new Person();
        person.setAge(17);

        PersonService personService = new PersonService(person);
        boolean expected = false;
        boolean actual = personService.ifAdult();

        assertEquals(expected, actual);
    }
}
