package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.unit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void testAdd_success(){
        Integer result = calculator.add(5,5);
        Assertions.assertEquals(result, 10);
    }

    @Test
    void testSubstract_success(){
        Integer result = calculator.substract(5,5);
        Assertions.assertEquals(result, 0);
    }

    @Test
    void testMultiply_success(){
        Integer result = calculator.multiply(5,5);
        Assertions.assertEquals(result, 25);
    }

    @Test
    void testDivide_success(){
        Integer result = calculator.divide(6,5);
        Assertions.assertEquals(result, 1);
    }

    @Test
    void testAdd_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            Integer result = calculator.add(null, 5);
            Assertions.assertEquals(result, 10);
        });
    }

    @Test
    void testSubstract_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
        Integer result = calculator.substract(null,5);
        Assertions.assertEquals(result, 0);
        });
    }

    @Test
    void testMultiply_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> {
            Integer result = calculator.multiply(null, 5);
            Assertions.assertEquals(result, 25);
        });
    }

    @Test
    void testDivide_failInvalidParameter(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Integer result = calculator.divide(5,null);
            Assertions.assertEquals(result, 1);
        });
    }

    @Test
    void testDivide_failDivisionByZero(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Integer result = calculator.divide(5,0);
            Assertions.assertEquals(result, 1);
        });
    }
}
