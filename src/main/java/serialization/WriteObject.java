package main.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    private final static String PEOPLE_DATA = "people.bin";

    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try (FileOutputStream fos = new FileOutputStream(PEOPLE_DATA);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
