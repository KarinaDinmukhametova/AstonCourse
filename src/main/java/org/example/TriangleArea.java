package org.example;

public class TriangleArea {

    // Площадь по основанию и высоте
    public static double calculate(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть больше нуля");
        }
        return base * height / 2;
    }
}
