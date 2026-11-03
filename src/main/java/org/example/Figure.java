package org.example;

public interface Figure {
    double area();
    double perimeter();
    String fillColor();
    String borderColor();


    default void figureInfo(){
        System.out.println();
        System.out.println("Площадь: " +area());
        System.out.println("Периметр: " + perimeter());
        System.out.println("Цвет фона: " + fillColor());
        System.out.println("Цвет границ: " + borderColor());
    }

}
