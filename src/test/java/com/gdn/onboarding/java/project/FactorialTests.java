package com.gdn.onboarding.java.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTests {

    @Test
    public void testGetFactorial_success() {
        Factorial factorial = new Factorial();
        Integer result1 = factorial.getFactorial(5);
        Integer result2 = factorial.getFactorial(0);
        Integer result3 = factorial.getFactorial(1);

        Assertions.assertEquals(120, result1);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals(1, result3);
    }

    @Test
    public void testGetFactorial_failed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial factorial = new Factorial();
            Integer result = factorial.getFactorial(null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial factorial = new Factorial();
            Integer result = factorial.getFactorial(-1);
        });
    }

}
