package org.example;

public class Dog extends Animal {
    static int numberDog = 0;

    public Dog(String name) {
        super(name, 500, 10);
        numberDog++;
    }

    public static int getNumberDog() {
        return  numberDog;
    }
}