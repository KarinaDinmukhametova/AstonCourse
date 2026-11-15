package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void factorialTwo(){
        assertEquals(2,Factorial.calculate(2));
    }


}
