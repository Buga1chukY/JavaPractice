package main.java.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private static final String HEADER_ROW = "Id,Name,Age,City";

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();

        Person person1 = new Person(1, "Maga", 22, "Kyiv");
        Person person2 = new Person(2, "Sasha", 21, "Kyiv");
        Person person3 = new Person(3, "Tima", 20, "Kyiv");
        Person person4 = new Person(4, "Yarik", 19, "Kyiv");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        return persons;
    }

    public void writePerson(String peopleData, List<Person> persons) {

        try (FileWriter writer = new FileWriter(peopleData)) {

            for (Person person : persons) {
                String resultPerson = PersonService.toCsvRow(person);
                writer.write(resultPerson + '\n');
            }
            String messageFormat = "Data is successfully saved to file '%s'";
            String result = String.format(messageFormat, peopleData);
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }

    }

    public List<Person> getYoungestPerson(List<Person> persons) {
        List<Person> youngestPersons = new ArrayList<>();

        if (persons.isEmpty()) {
            return youngestPersons;
        }

        int currentPersonAge;
        int previousPersonAge = persons.get(0).getAge();

        for (Person person : persons) {
            currentPersonAge = person.getAge();
            if (currentPersonAge < previousPersonAge) {
                previousPersonAge = currentPersonAge;

                youngestPersons.clear();
                youngestPersons.add(person);
            } else if (currentPersonAge == previousPersonAge) {
                youngestPersons.add(person);
            }
        }

        return youngestPersons;
    }

    public List<Person> getPersonsFromFile(String peopleData) {
        PersonService personService = new PersonService();
        List<Person> persons = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(peopleData))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {

                Person person = personService.toPerson(string);
                persons.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }

        return persons;
    }

    public static String toCsvRow(Person person) {
        int id = person.getId();
        String name = person.getName();
        int age = person.getAge();
        String city = person.getCity();

        String messageFormat = "%d,%s,%d,%s";
        return String.format(messageFormat, id, name, age, city);
    }

    public Person toPerson(String input) {

        String emptyString = "";
        if (emptyString.equals(input)) {
            throw new IllegalStateException("The string is empty");
        }

        String[] parts = input.split(",");

        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int age = Integer.parseInt(parts[2]);
        String city = parts[3];

        return new Person(id, name, age, city);
    }

}
