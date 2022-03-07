package com.gdn.onboarding.java.two.onboardingjava.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //Add
    @Test
    public void testAdd_success(){
        Calculator calculator = new Calculator();
        Integer result = calculator.add(10,10);

        Assertions.assertEquals(20, result);
    }
    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.add(null,10);

            Assertions.assertEquals(20, result);
        });
    }
    //Minus
    @Test
    public void testMinus_success(){
        Calculator calculator = new Calculator();
        Integer result = calculator.minus(100,10);

        Assertions.assertEquals(90, result);
    }
    @Test
    public void testMinus_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.minus(null,10);

            Assertions.assertEquals(20, result);
        });
    }
    //Divide
    @Test
    public void testDivide_success(){
        Calculator calculator = new Calculator();
        Integer result = calculator.devide(10,10);

        Assertions.assertEquals(1, result);
    }
    @Test
    public void testDivide_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.devide(null,10);

            Assertions.assertEquals(1, result);
        });
    }
    //Multiply
    @Test
    public void testMultiply_success(){
        Calculator calculator = new Calculator();
        Integer result = calculator.multiply(10,10);

        Assertions.assertEquals(100, result);
    }
    @Test
    public void testMultiply_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calculator = new Calculator();
            Integer result = calculator.multiply(null,10);

            Assertions.assertEquals(20, result);
        });
    }
}