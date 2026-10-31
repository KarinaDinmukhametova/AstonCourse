package org.example;

public class Lession_3 {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Шарик");
        dogOne.run(30);
        dogOne.swim(500);

        Cat catOne = new Cat("Барсик", 10);
        catOne.run(150);
        catOne.swim(10);

        System.out.println();
        System.out.println("Животных: " + Animal.numberAnimal);
        System.out.println("Собак: " + Dog.numberDog);
        System.out.println("Котов: " + Cat.numberCat);

        System.out.println();
        FoodCat bowl = new FoodCat(20);
        Cat[] cats = {
                new Cat("Матроскин", 5),
                new Cat("Васька", 10),
                new Cat("Мурзик", 10)
        };

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (Cat cat : cats) {
            cat.printInfo();
        }

        bowl.addFood(50);
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (Cat cat : cats) {
            cat.printInfo();
        }
    }
}

