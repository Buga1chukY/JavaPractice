package com.knu.buga1chuk.oop_practice.animal_practice;

public class Dog {
    private final String name;

    // Constructor
    public Dog(String birthName) {
        name = birthName;
    }

    public void sound() {
        System.out.println("gow");
    }

    public void dogName() {
        System.out.println(name);
    }

}
