package com.gdn.onboarding.java.onboardingjava.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

public class CalculatorTest {

    @Test
    public void testAdd_success(){
        Calculator calc = new Calculator();
        Integer result = calc.add(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calc = new Calculator();
            Integer result = calc.add(null,20);
            Assertions.assertEquals(20,result);
        });
    }

    @Test
    public void testMinus_success(){
        Calculator calc = new Calculator();
        Integer result = calc.minus(1,2);
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void testMinus_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calc = new Calculator();
            Integer result = calc.minus(null,20);
            Assertions.assertEquals(20,result);
        });
    }

    @Test
    public void testDivide_success(){
        Calculator calc = new Calculator();
        Integer result = calc.divide(1,2);
        Assertions.assertEquals(0,result);
    }

    @Test
    public void testDivide_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calc = new Calculator();
            Integer result = calc.divide(null,20);
            Assertions.assertEquals(20,result);
        });
    }

    @Test
    public void testMultiply_success(){
        Calculator calc = new Calculator();
        Integer result = calc.multiply(1,2);
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testMultiply_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Calculator calc = new Calculator();
            Integer result = calc.multiply(null,20);
            Assertions.assertEquals(20,result);
        });
    }
}
