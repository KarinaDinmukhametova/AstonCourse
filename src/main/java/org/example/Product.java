package org.example;

public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    int price;
    boolean booking;


    public Product( String name, String productionDate, String manufacturer,
                    String country, int price, boolean booking){
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;

    }

public void info() {
    System.out.println("Название: "+ name+ ". Дата производства: "+ productionDate+
            ". Производитель: "+manufacturer+ ". Страна происхождения: "+country+
            ". Цена: "+price+ ". Состояние бронирования: "+booking);

}
}
