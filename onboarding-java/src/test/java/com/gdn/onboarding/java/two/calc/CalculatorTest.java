package com.gdn.onboarding.java.two.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final Calculator calculator = new Calculator();

    @Test
    public void testAdd_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer result = calculator.add(null, 10);

            Assertions.assertEquals(20, result);
        });
    }

    @Test
    public void testAdd_success(){
        Integer result = calculator.add(10, 10);

        Assertions.assertEquals(20, result);
    }

    @Test
    public void testMinus_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{

            Integer result = calculator.minus(null, 10);

            Assertions.assertEquals(0, result);
        });
    }

    @Test
    public void testMinus_success(){

        Integer result = calculator.minus(10, 10);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiply_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{

            Integer result = calculator.multiply(null, 10);

            Assertions.assertEquals(100, result);
        });
    }

    @Test
    public void testMultiply_success(){

        Integer result = calculator.multiply(10, 10);

        Assertions.assertEquals(100, result);
    }

    @Test
    public void testDivide_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{

            Integer result = calculator.divide(null, 10);

            Assertions.assertEquals(1, result);
        });
    }

    @Test
    public void testDivide_success(){

        Integer result = calculator.divide(10, 10);

        Assertions.assertEquals(1, result);
    }
}