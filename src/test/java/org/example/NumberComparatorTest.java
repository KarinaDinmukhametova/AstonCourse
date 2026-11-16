package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparatorTest {
    @Test
    @DisplayName("Позитивная проверка. Сравнение чисел. Результат: первое число больше")
    void numberComparatorTest_1(){
        assertEquals("Первое число больше", NumberComparator.compare(7,1) );
    }

    @Test
    @DisplayName("Позитивная проверка. Сравнение чисел. Результат: второе число больше")
    void numberComparatorTest_2(){
        assertEquals("Второе число больше", NumberComparator.compare(3,8) );
    }

    @Test
    @DisplayName("Позитивная проверка. Сравнение чисел. Результат: числа равны")
    void numberComparatorTest_3(){
        assertEquals("Числа равны", NumberComparator.compare(1,1) );
    }
}

