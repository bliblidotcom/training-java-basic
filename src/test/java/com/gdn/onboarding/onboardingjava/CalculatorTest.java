package com.gdn.onboarding.onboardingjava;
import com.gdn.onboarding.onboardingjava.contracts.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public Calculator calculator;

    @BeforeEach
    void createCalculator() {
        calculator = new CalculatorImpl();
    }

    @Test
    void add_HasResult_Float() {
        float addResult = calculator.add(12, 5);
        Assertions.assertEquals(17f, addResult);
    }

    @Test
    void minus_HasResult_Float() {
        float minusResult = calculator.minus(12, 5);
        Assertions.assertEquals(7f, minusResult);
    }

    @Test
    void divide_HasResult_Float() {
        float divideResult = calculator.divide(12, 5);
        Assertions.assertEquals(2.4f, divideResult);
    }

    @Test
    void divide_WithZeroDivision_Exception() {
        try {
            calculator.divide(12, 0);
            Assertions.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Division by zero is not supported", e.getMessage());
        }
    }

    @Test
    void multiply_HasResult_Float() {
        float multiplyResult = calculator.multiply(12, 5);
        Assertions.assertEquals(60f, multiplyResult);
    }


}
