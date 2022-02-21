package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void factorial_success() {
        Assertions.assertEquals(120, Factorial.doFactorial(5));
    }

    @Test
    public void factorial_failed() {
        Assertions.assertNotEquals(120, Factorial.doFactorial(4));
    }
}
