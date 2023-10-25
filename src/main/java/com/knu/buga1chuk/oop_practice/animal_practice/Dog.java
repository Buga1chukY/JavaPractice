package com.knu.buga1chuk.oop_practice.animal_practice;

public class Dog {
    public void sound() {
        System.out.println("gow");
    }

    // Constructor
    public Dog(String birthName) {
        name = birthName;
    }

    private String name;

    public void dogName() {
        System.out.println(name);
    }

}
