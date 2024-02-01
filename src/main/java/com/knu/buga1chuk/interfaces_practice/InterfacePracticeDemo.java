package com.knu.buga1chuk.interfaces_practice;

import com.knu.buga1chuk.interfaces_practice.model.Alien;
import com.knu.buga1chuk.interfaces_practice.model.Animal;
import com.knu.buga1chuk.interfaces_practice.model.Person;
import com.knu.buga1chuk.interfaces_practice.service.InfoService;
import com.knu.buga1chuk.interfaces_practice.service.impl.AlienInfoServiceImpl;
import com.knu.buga1chuk.interfaces_practice.service.impl.AnimalInfoServiceImpl;
import com.knu.buga1chuk.interfaces_practice.service.impl.PersonInfoServiceImpl;

public class InterfacePracticeDemo {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        Alien alien = new Alien(51);

        InfoService<Alien> alineInfoService = new AlienInfoServiceImpl();
        InfoService<Animal> animalInfoService = new AnimalInfoServiceImpl();
        InfoService<Person> personInfoService = new PersonInfoServiceImpl();

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
