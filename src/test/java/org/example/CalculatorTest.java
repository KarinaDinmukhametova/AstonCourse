package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

        @Test (description = "Негативная проверка. Вычитание чисел")
        void calculatorTestSubtract(){
            assertEquals(Calculator.subtract(4,2),1);
        }

        @Test (description = "Негативная проверка. Сложение чисел")
        void calculatorTestAdd(){
            assertEquals(Calculator.add(2,8), 11);
        }

        @Test (description = "Негативная проверка. Умножение чисел")
        void calculatorTestMultiply(){
            assertEquals(Calculator.multiply(2,8), 17);
        }

        @Test (description = "Негативная проверка. Деление чисел")
        void calculatorTestDivide(){
            assertEquals(Calculator.divide(20,2), 9);
        }


    }


