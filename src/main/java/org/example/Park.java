package org.example;

public class Park {
    public class Attraction{
    String name;
    String workingHouse;
    double price;

    public Attraction(String name, String workingHouse, double price) {
        this.name=name;
        this.workingHouse=workingHouse;
        this.price=price;
    }
    public void infoPark(){
        System.out.println("Атракцион"+name+ ". Часы работы: "+workingHouse+". Стоимость: "+price);
    }
}
}
