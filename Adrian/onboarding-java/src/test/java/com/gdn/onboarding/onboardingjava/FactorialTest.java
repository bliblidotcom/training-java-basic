package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void sameResult(){
        int result = Factorial.fact(4);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void differentResult(){
        int result = Factorial.fact(4);
        Assertions.assertNotEquals("12", result);
    }
}
