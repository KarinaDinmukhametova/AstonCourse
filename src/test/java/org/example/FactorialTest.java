package org.example;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {


    @Test(description = "Негативная проверка. Отрицательоне число", expectedExceptions = IllegalArgumentException.class)

      void testFactorialNegative(){
        Factorial.calculate(-1);
    }
}


