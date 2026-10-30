package org.example;

public class Lession_2 {
    public static void main(String[] args) {
        Product[] productArray = new Product[5];

        productArray[0] = new Product("Стол", "20.10.2026", "Мебельная Фабрика", "Россия", 7000, true);
        productArray[1] = new Product("Стул", "10.10.2026", "Мебельная Фабрика", "Россия", 3900, false);
        productArray[2] = new Product("Диван", "11.09.2026", "Фабрика Диванов", "Китай", 35000, true);
        productArray[3] = new Product("Кровать", "04.03.2026", "Фабрика Диванов", "Китай", 25500, false);
        productArray[4] = new Product("Шкаф", "18.06.2026", "Мебельная Фабрика", "Россия", 19700, true);

        for (int i = 0; i < productArray.length; i++) {
            productArray[i].info();

        }
        Park park = new Park();
        Park.Attraction park1 = park.new Attraction("Колесо обозрения", "9:00-23:00", 400);


        park1.infoPark();
    }
}


