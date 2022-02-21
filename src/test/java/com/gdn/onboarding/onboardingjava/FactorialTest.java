package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFact_success() throws Exception{
        Integer tc = new Factorial().fact(4);
        if (tc != 24) {
            System.out.println("GAGAL");
            throw new Exception();
        }
    }
}
