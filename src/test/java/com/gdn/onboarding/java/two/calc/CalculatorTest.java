package com.gdn.onboarding.java.two.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd_success(){
        Calculator calculator = new Calculator();
        Integer result = calculator.add(5, 8);
        Assertions.assertEquals(13, result);
    }

    @Test
    public void testAdd_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Calculator calculator = new Calculator();
            Integer result = calculator.add(null, 8);
            Assertions.assertEquals(13, result);
        });
    }

    @Test
    public void testSubtract_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.subtract(8, 5);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSubtract_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calculator = new Calculator();
            Integer result = calculator.subtract(8, null);
            Assertions.assertEquals(3, result);
        });
    }

    @Test
    public void testDivide_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivide_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calculator = new Calculator();
            Integer result = calculator.divide(10, null);
            Assertions.assertEquals(2, result);
        });
    }

    @Test
    public void testDivide_failed2() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Calculator calculator = new Calculator();
            Integer result = calculator.divide(10, 0);
            Assertions.assertEquals(2, result);
        });
    }

    @Test
    public void testMultiply_success() {
        Calculator calculator = new Calculator();
        Integer result = calculator.multiply(10, 5);
        Assertions.assertEquals(50, result);
    }

    @Test
    public void testMultiply_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calculator = new Calculator();
            Integer result = calculator.multiply(10, null);
            Assertions.assertEquals(50, result);
        });
    }
}