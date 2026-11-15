package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Позитивная проверка. Вычитание чисел")
    void calculatorTestSubtract(){
        assertEquals(12,Calculator.subtract(20,8));
    }

    @Test
    @DisplayName("Позитивная проверка. Сложение чисел")
    void calculatorTestAdd(){
        assertEquals(10,Calculator.add(2,8));
    }

    @Test
    @DisplayName("Позитивная проверка. Умножение чисел")
    void calculatorTestMultiply(){
        assertEquals(16,Calculator.multiply(2,8));
    }

    @Test
    @DisplayName("Позитивная проверка. Деление чисел")
    void calculatorTestDivide(){
        assertEquals(10,Calculator.divide(20,2));
    }


    }


