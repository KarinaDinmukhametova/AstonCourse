package org.example;

public class Lession_4 {
    public static void main(String[] args) {
       Circle circleOne = new Circle(20, "Красный", "Черный");
       Rectangle rectangleOne= new Rectangle(10, 5, "Синий", "Черный");
       Triangle triangleOne= new Triangle(20, 10, 10, 5, "Белый", "Черный");



        System.out.println("Круг:");
        circleOne.figureInfo();
        System.out.println();

        System.out.println("Прямоугольник:");
        rectangleOne.figureInfo();
        System.out.println();

        System.out.println("Треугольник:");
        triangleOne.figureInfo();


    }
}
