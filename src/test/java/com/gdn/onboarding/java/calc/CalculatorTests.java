package com.gdn.onboarding.java.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void testAdd_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.add(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testAdd_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.add(null, 10);
            Assertions.assertEquals(20, result);
        });
    }

    @Test
    public void testMinus_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.minus(10, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMinus_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.minus(null, 10);
            Assertions.assertEquals(0, result);
        });
    }

    @Test
    public void testMultiply_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.multiply(10, 10);
        Assertions.assertEquals(100, result);
    }

    @Test
    public void testMultiply_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.multiply(null, 10);
            Assertions.assertEquals(100, result);
        });
    }

    @Test
    public void testDivide_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.divide(10, 10);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testDivide_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.divide(null, 10);
            Assertions.assertEquals(1, result);
        });
    }

}
