package org.example;

import org.testng.annotations.Test;

public class TriangleAreaTest {

        @Test(description = "Негативная проверка площади треугольника. Результат:6", expectedExceptions =IllegalArgumentException.class )

        void triangleAreaTestNegative(){

            TriangleArea.calculate(3.0,0);
        }
    }
