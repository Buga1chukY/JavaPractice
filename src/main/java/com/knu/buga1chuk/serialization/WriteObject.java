package com.knu.buga1chuk.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    private static final String PEOPLE_DATA_FILE_PATH = "target/people.bin";

    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob", 12, "Jmerenka");
        Person person2 = new Person(2, "Mike", 18, "Fastiv");

        File file = new File(PEOPLE_DATA_FILE_PATH);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
