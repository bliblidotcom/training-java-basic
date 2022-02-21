package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_success() {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(10,10);
        Assertions.assertEquals(20, addResult);
    }

    @Test
    public void testMinus_success() {
        Calculator calculator = new Calculator();
        int minusResult = calculator.minus(10,10);
        Assertions.assertEquals(0, minusResult);
    }

    @Test
    public void testMultiply_success() {
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.multiply(10,10);
        Assertions.assertEquals(100, multiplyResult);
    }

    @Test
    public void testDivide_success() {
        Calculator calculator = new Calculator();
        int divideResult = calculator.divide(10,10);
        Assertions.assertEquals(1, divideResult);
    }
}
