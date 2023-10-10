package main.java.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String messageFormat = "Person {id= %d, name='%s'}";
        return String.format(messageFormat, id, name);
    }

}
