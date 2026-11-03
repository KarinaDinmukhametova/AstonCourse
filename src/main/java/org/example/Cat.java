package org.example;

public class Cat extends Animal {
    private static int numberCat = 0;
    private static int food = 0;   // общая миска для всех котов

    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        super(name, 200, 0);
        this.appetite = appetite;
        this.isFull = false;
        numberCat++;
    }

    // Добавить еду в миску
    public static void addFood(int amount) {
        if (amount > 0) {
            food = food + amount;
            System.out.println("Добавили " + amount + " единиц еды. Всего корма " + food);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды");
        }
    }

    // Кот ест из общей миски
    public void eat() {
        if (food >= appetite) {
            food = food - appetite;
            isFull = true;
            System.out.println(name + " съел " + appetite + " единиц корма, осталось " + food);
        } else {
            System.out.println(name + " не хватает корма");
        }
    }

    public void printInfo() {
        System.out.println(name + " сытость: " + isFull);
    }

    public static int getNumberCat() {
        return numberCat;
    }
}