package com.knu.buga1chuk.serialization;

import com.knu.buga1chuk.constant.FilePathConstants;
import com.knu.buga1chuk.model.Person;

import java.io.*;

public class ReadObject {

    public static void main(String[] args) {
        File file = new File(FilePathConstants.PEOPLE_DATA_BINARY_PATH);

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }
    }
}
