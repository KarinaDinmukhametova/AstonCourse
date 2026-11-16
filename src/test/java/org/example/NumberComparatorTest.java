package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {
        @Test(description = "Позитивная проверка. Сравнение чисел. Результат: первое число больше")
        void numberComparatorTest_1(){
            assertEquals(NumberComparator.compare(7,1), "Первое число больше" );
        }

        @Test (description = "Позитивная проверка. Сравнение чисел. Результат: второе число больше")
        void numberComparatorTest_2(){
            assertEquals(NumberComparator.compare(3,8), "Второе число больше");
        }

        @Test (description = "Позитивная проверка. Сравнение чисел. Результат: числа равны")
        void numberComparatorTest_3(){
            assertEquals(NumberComparator.compare(1,1), "Числа равны");
        }
    }


