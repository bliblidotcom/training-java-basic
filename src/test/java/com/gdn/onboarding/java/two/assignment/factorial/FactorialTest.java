package com.gdn.onboarding.java.two.assignment.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    public static final Factorial factorial = new Factorial();

    @Test
    public void testCalculateFactorial_success() {
        Integer result = factorial.calculateFactorial(10);
        Assertions.assertEquals(3628800, result);
    }

    @Test
    public void testCalculateFactorial_zero_success() {
        Integer result = factorial.calculateFactorial(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorial_negative_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Integer result = factorial.calculateFactorial(-10);
            Assertions.assertEquals(0, result);
        });
    }

    @Test
    public void testCalculateFactorial_null_failed() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            Integer result = factorial.calculateFactorial(null);
            Assertions.assertEquals(2, result);
        });
    }
}