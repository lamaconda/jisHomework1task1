package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getNameTest() {
        Person person = new Person();
        person.setAge(18);
        person.setName("Max");

        String expected = "Max";
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getAgeTest() {
        Person person = new Person();
        person.setAge(18);
        person.setName("Max");

        int expected = 18;
        int actual = person.getAge();
        assertEquals(expected, actual);

    }

    @Test
    public void equalsTest() {
        Person personLeft = new Person();
        personLeft.setAge(18);
        personLeft.setName("Max");

        Person personRight = new Person();
        personRight.setAge(18);
        personRight.setName("Max");

        boolean expected = true;
        boolean actual = personLeft.equals(personRight);
        assertEquals(expected, actual);
    }

    @Test
    public void hashCodeTest() {
        Person person = new Person();
        person.setAge(18);
        person.setName("Max");

        int expected = 2391823;
        int actual = person.hashCode();
        assertEquals(expected, actual);

    }

    @Test
    public void toStringTest() {
        Person person = new Person();
        person.setAge(18);
        person.setName("Max");

        String expected = "Person{name='Max', age=18}";
        String actual = person.toString();
        assertEquals(expected, actual);
    }
}
