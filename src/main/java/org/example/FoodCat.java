package org.example;

public class FoodCat {
    private int food;

    public FoodCat(int food) {
        this.food = food;
    }

    public void addFood(int amountAdd) {
        if (amountAdd > 0) {
            food = food + amountAdd;
            System.out.println("Добавили " + amountAdd + " единиц еды. Всего корма " + food);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды");
        }
    }

    public boolean eatFood(int amount) {
        if (food >= amount) {
            food = food - amount;
            System.out.println("Кот съел " + amount + " единиц корма, осталось " + food);
            return true;
        } else {
            System.out.println("Не хватает корма");
            return false;
        }
    }
}
