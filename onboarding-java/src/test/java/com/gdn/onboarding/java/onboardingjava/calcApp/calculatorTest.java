package com.gdn.onboarding.java.onboardingjava.calcApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @Test
    public void testAdd_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.add(10, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testAdd_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.add(null, 5);
            Assertions.assertEquals(15, result);
        });
    }

    @Test
    public void testSubstract_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.substract(10, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testSubstract_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.substract(null, 5);
            Assertions.assertEquals(5, result);
        });
    }

    @Test
    public void testMultiply_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void testMultiply_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.multiply(null, 5);
            Assertions.assertEquals(25, result);
        });
    }

    @Test
    public void testDivide_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.divide(10, 5);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivide_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.divide(null, 5);
            Assertions.assertEquals(2, result);
        });
    }
}