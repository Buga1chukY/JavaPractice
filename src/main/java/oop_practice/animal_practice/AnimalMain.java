package main.java.oop_practice.animal_practice;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.sound();
        dog.dogName();


        Dog dog2 = new Dog("Rob");
        //dog2.name = "James";
        dog2.dogName();
    }
}
