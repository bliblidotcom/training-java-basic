package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testCalculateFactorial_success() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(6);
        Assertions.assertEquals(720, result);
    }
}
