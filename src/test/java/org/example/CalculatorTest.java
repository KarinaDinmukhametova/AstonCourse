package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
        @Test (description = "Негативная проверка. Деление чисел", expectedExceptions = ArithmeticException.class)
        void calculatorTestDivide(){
            Calculator.divide(20,0);}

        @Test (description = "Позитивная проверка. Вычитание чисел")
        void calculatorTestSubtract(){
            assertEquals(Calculator.subtract(4,2),2);
        }

        @Test (description = "Позитивная проверка. Сложение чисел")
        void calculatorTestAdd(){
            assertEquals(Calculator.add(2,8), 10);
        }

        @Test (description = "Позитивная проверка. Умножение чисел")
        void calculatorTestMultiply(){
            assertEquals(Calculator.multiply(2,8), 16);
        }




    }


