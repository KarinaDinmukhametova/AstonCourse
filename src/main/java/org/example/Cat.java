package org.example;

public class Cat extends Animal {
    static int numberCat = 0;
    int appetite;
    boolean isFull;

    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.appetite = appetite;
        this.isFull = false;
        numberCat++;
    }

    public void eat(FoodCat bowl) {
        if (bowl.eatFood(appetite)) {
            isFull = true;
        }
    }

    public void printInfo() {
        System.out.println(name + " сытость: " + isFull);
    }

}

