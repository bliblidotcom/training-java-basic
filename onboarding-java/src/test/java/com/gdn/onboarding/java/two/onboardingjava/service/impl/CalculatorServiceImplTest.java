package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {

    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CalculatorServiceImpl calculator = new CalculatorServiceImpl();
            Integer result = calculator.add(null, 10);
            Assertions.assertEquals(20, result);
        });
    }

    @Test
    public void testAdd_success(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        Integer result = calculator.add(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMinus_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CalculatorServiceImpl calculator = new CalculatorServiceImpl();
            Integer result = calculator.minus(null, 10);
            Assertions.assertEquals(10, result);
        });
    }

    @Test
    public void testMinus_success(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        Integer result = calculator.minus(20, 10);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testMultiply_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CalculatorServiceImpl calculator = new CalculatorServiceImpl();
            Integer result = calculator.multiply(null, 10);
            Assertions.assertEquals(50, result);
        });
    }

    @Test
    public void testMultiply_success(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        Integer result = calculator.multiply(5, 10);
        Assertions.assertEquals(50, result);
    }

    @Test
    public void testDivide_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            CalculatorServiceImpl calculator = new CalculatorServiceImpl();
            Integer result = calculator.divide(null, 4);
            Assertions.assertEquals(10, result);
        });
    }

    @Test
    public void testDivide_success(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        Integer result = calculator.divide(40, 4);
        Assertions.assertEquals(10, result);
    }
}