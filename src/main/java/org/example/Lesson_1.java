package org.example;
import java.util.Arrays;
public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(fiveNumber(13, 7));
        sixNumber(0);
        System.out.println(senenNumber(4));
        eightNumber("Всем привет", 4);
        System.out.println(nineNumber(1998));
        tenNumber();
        elevenNumber();
        twelveNumber();
        thirteenNumber();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSing() {
        int a = 12;
        int b = 45;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 23;
        int b = 56;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean fiveNumber(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void sixNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean senenNumber(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void eightNumber(String a, int b) {
        int c = 0;
        while (c < b) {
            c++;
            System.out.println(a);

        }
    }

    public static boolean nineNumber(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void tenNumber() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0) {
                arr[x] = 1;
            } else {
                arr[x] = 0;
            }
            System.out.print(arr[x]);
        }
        System.out.println();
    }

    public static void elevenNumber(){

        int[] x=new int[100];
        for (int i=1; i<101; i++){
            x[i-1]=i;
            System.out.print(x[i-1]+"  ");
        }
        System.out.println();
    }
    public static void twelveNumber(){
        int[] numbers={1,5,3,2,11,4,5,2,4,8,9,1};
        for( int a=0; a<numbers.length;a++){
            if (numbers[a]<6) {
                numbers[a] = numbers[a] * 2;
            }
            System.out.print(numbers[a]+ "  ");
        }
        System.out.println();
    }
    public static void thirteenNumber(){
        int [][] numbers=new int [3][3];
        for (int i = 0; i<numbers.length; i++){
            numbers[i][i]=1;
        }
        for(int i=0; i<numbers.length;i++){
            for (int b=0; b<numbers[i].length;b++){
                System.out.print(numbers[i][b]+" ");
            }
            System.out.println();
        }
    }
    }






