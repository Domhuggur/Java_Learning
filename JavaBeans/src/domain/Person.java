package domain;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;

    public Person (){};

    public Person (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getNamePerson(){
        return name;
    };
    public void setNamePerson(String name){
        this.name = name;
    };
    public String getSurnamePerson(){
        return surname;
    }
    public void setSurnamePerson(String surname){
        this.surname = surname;
    }
}
