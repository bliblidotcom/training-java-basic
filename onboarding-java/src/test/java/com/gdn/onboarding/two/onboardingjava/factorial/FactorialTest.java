package com.gdn.onboarding.two.onboardingjava.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testFactorial_success(){
        Factorial factorial = new Factorial();
        Integer answer = factorial.countFactorial(5);
        Assertions.assertEquals(120, answer);
    }

    @Test
    public void testFactorial_failed(){
        Assertions.assertThrows(IllegalArgumentException.class , ()->{
            Factorial factorial = new Factorial();
            Integer answer = factorial.countFactorial(null);
            Assertions.assertEquals(120, answer);
        });
    }
}