package by.jrr.jis4.bean;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
    private String name;
    private int age;

    public Person() {
//        no args constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String NAME) {
        this.name = NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
