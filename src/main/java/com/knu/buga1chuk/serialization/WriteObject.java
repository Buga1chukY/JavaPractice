package com.knu.buga1chuk.serialization;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob", 12, "Jmerenka");
        Person person2 = new Person(2, "Mike", 18, "Fastiv");

        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
