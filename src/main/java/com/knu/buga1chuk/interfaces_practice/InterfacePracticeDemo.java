package com.knu.buga1chuk.interfaces_practice;

import com.knu.buga1chuk.interfaces_practice.model.Alien;
import com.knu.buga1chuk.interfaces_practice.model.Animal;
import com.knu.buga1chuk.interfaces_practice.model.Person;
import com.knu.buga1chuk.interfaces_practice.service.InfoService;
import com.knu.buga1chuk.interfaces_practice.service.impl.AlienInfoServiceImpl;
import com.knu.buga1chuk.interfaces_practice.service.impl.AnimalInfoServiceImpl;
import com.knu.buga1chuk.interfaces_practice.service.impl.PersonInfoServiceImpl;

public class InterfacePracticeDemo {
    public static final InfoService<Alien> alineInfoService = new AlienInfoServiceImpl();
    public static final InfoService<Animal> animalInfoService = new AnimalInfoServiceImpl();
    public static final InfoService<Person> personInfoService = new PersonInfoServiceImpl();

    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        Alien alien = new Alien(51);

        alineInfoService.showInfo(alien);
        animalInfoService.showInfo(animal);
        personInfoService.showInfo(person);

        alineInfoService.greetings();
        animalInfoService.greetings();
        personInfoService.greetings();

        alineInfoService.sleep();
        animalInfoService.sleep();
        personInfoService.sleep();

    }

}
