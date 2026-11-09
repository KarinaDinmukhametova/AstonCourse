package org.example;

public class Lession_5 {

    public static void sizeArray(String[][] array) throws MyArraySizeException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Должно быть 4 строки");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Должно быть 4 элемента в строке " + i);
            }
        }
    }

    public static int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Некорректные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arrayDad = {{"1", "2", "3", "4"},
                {"a", "2", "2", "2"},
                {"1", "1", "1", "1"}};

        String[][] arrayGoog = {{"1", "2", "3", "4"},
                {"9", "2", "2", "2"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};


        System.out.println("Массив 1");
        try {
            sizeArray(arrayDad);
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный массив. " +e.getMessage());
        }

        try {
            System.out.println(" Сумма элементов: "+sumArray(arrayDad));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Массив 2");

        try {
            sizeArray(arrayGoog);
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный массив. " +e.getMessage());
        }

        try {
            System.out.println(" Сумма элементов: "+sumArray(arrayGoog));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Проверка выхода за пределы массива: ");
    try{
        System.out.println(arrayGoog[3][4]);
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Выход за пределы массива");


    }
}}
