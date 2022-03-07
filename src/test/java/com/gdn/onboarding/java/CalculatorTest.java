package com.gdn.onboarding.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test scenario sukses untuk method add")
    public void testAddSuccess(){
        Integer result = calculator.add(10,10);

        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess(){
        Integer result = calculator.divide(100,10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    public void testMinus(){
        Integer result = calculator.minus(100,10);
        assertEquals(90, result);
    }

    @Test
    public void testMultiply(){
        Integer result = calculator.multiply(100,10);
        assertEquals(1000, result);
    }
}
