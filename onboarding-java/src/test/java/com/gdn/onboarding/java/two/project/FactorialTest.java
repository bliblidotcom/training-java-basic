package com.gdn.onboarding.java.two.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private static final Factorial factorial = new Factorial();

    @Test
    void calculateFactorial_success1() {
        Long result = factorial.calculateFactorial(Long.valueOf(5));
        Long expected = Long.valueOf(120);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateFactorial_success2() {
        Long result = factorial.calculateFactorial(Long.valueOf(0));
        Long expected = Long.valueOf(1);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateFactorial_fail1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Long result = factorial.calculateFactorial(null);
            Long expected = Long.valueOf(1);
            Assertions.assertEquals(expected, result);
        });
    }

    @Test
    void calculateFactorial_fail2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Long result = factorial.calculateFactorial(Long.valueOf(-1));
            Long expected = Long.valueOf(1);
            Assertions.assertEquals(expected, result);
        });
    }
}