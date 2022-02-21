package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void createFactorial() {
        factorial = new FactorialImpl();
    }

    @Test
    void factorial_LowNumber_HasResult() {
        int result = factorial.factorial(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void factorial_NegativeNumber_HasResult() {
        int result = factorial.factorial(-2);
        Assertions.assertEquals(1, result);
    }

//    @Test
//    void factorial_BigNumber_HasResult() {
//        // still need to be asked
//        int result = factorial.factorial(20);
//        Assertions.assertEquals(1, result);
//    }


}
