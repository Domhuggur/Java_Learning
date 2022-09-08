package test;
import domain.Person;

public class TestJavaBeans {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setNamePerson("James");
        person1.setSurnamePerson("Jones");

        System.out.println("Person1 name: " + person1.getNamePerson());
        System.out.println("Person1 surname: " + person1.getSurnamePerson());
    }
}