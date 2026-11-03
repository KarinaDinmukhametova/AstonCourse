package org.example;

public class Lession_3 {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Шарик");
        dogOne.run(30);
        dogOne.swim(50);

        Cat catOne = new Cat("Матроскин", 0);
        catOne.run(150);
        catOne.swim(5);



        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Васька", 10),
                new Cat("Мурзик", 15)
        };


        System.out.println();
        System.out.println("Животных: " + Animal.getNumberAnimal());
        System.out.println("Собак: " + Dog.getNumberDog());
        System.out.println("Котов: " + Cat.getNumberCat());

        System.out.println();
        Cat.addFood(20);
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat();
        }
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }
        System.out.println();

        Cat.addFood(60);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat();
        }
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            cats[i].printInfo();
        }
    }
}