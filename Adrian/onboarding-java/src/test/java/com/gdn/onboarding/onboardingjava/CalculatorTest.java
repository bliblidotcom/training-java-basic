package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;

public class CalculatorTest {
    int a = 20, b=10;
    @Test
    public void addTest(){
        int add = Calculator.add(a,b);
        Assertions.assertEquals(abs(a) + abs(b), add);
    }

    @Test
    public void minusTest(){
        int minus = Calculator.minus(a,b);
        Assertions.assertEquals(abs(a) - abs(b), minus);
    }
    @Test
    public void multiplyTest(){
        int multiply = Calculator.multiply(a,b);
        Assertions.assertEquals(abs(a) * abs(b), multiply);
    }

    @Test
    public void divideTest(){
        int divide = Calculator.divide(a,b);
        Assertions.assertEquals(abs(a) / abs(b), divide);
    }
}
