package com.gdn.onboarding.java.pseudocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    public void getFactorial1(){
        int result = factorial.getFactorial(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void getFactorial2(){
        int result = factorial.getFactorial(2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void getFactorial3(){
        int result = factorial.getFactorial(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void getFactorial4(){
        int result = factorial.getFactorial(4);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void getFactorial5(){
        int result = factorial.getFactorial(5);
        Assertions.assertEquals(120, result);
    }
}
