package org.example;

public class lesson_7 {
        public static void main(String[] args) {
            Phone directory = new Phone();

            directory.add("Иванов", "+7-900-123-45-67");
            directory.add("Петров", "+7-911-222-33-44");
            directory.add("Иванов", "+7-999-888-77-66");
            directory.add("Сидоров", "+7-921-555-66-77");

            System.out.println();
            directory.get("Иванов");
            directory.get("Сидоров");
            directory.get("Смирнов");
        }
    }


