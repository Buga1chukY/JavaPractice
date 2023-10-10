package main.java.serialization;

import java.io.*;

public class ReadObject {

    private final static String PEOPLE_DATA = "people.bin";

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(PEOPLE_DATA);
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
