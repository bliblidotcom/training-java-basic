package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_success() throws Exception {
        int addResult = Calculator.add(10, 10);
        if ( addResult != 20 ) {
            System.out.println("Gagal");
            throw new Exception();
        }
    }
}
