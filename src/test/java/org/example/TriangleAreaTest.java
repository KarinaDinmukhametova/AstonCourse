package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAreaTest {
    @Test
    @DisplayName("Позитивная проверка площади треугольника. Результат:6")

    void triangleAreaTest_3_4(){
        assertEquals(6.0,TriangleArea.calculate(3.0,4.0) );
    }
}
