package com.gdn.onboarding.java.two.onboardingjava.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testFactorial_success1(){
        Factorial f = new Factorial();
        Integer result = f.factorial(0);

        Assertions.assertEquals(0, result);
    }
    @Test
    public void testFactorial_success2(){
        Factorial f = new Factorial();
        Integer result = f.factorial(1);

        Assertions.assertEquals(1, result);
    }
    @Test
    public void testFactorial_success3(){
        Factorial f = new Factorial();
        Integer result = f.factorial(5);

        Assertions.assertEquals(120, result);
    }
    @Test
    public void testFactorial_success4(){
        Factorial f = new Factorial();
        Integer result = f.factorial(10);

        Assertions.assertEquals(3628800, result);
    }
    @Test
    public void testFactorial_failed1(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial f = new Factorial();
            Integer result = f.factorial(null);

            Assertions.assertEquals(3628800, result);
        });
    }
    @Test
    public void testFactorial_failed2(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Factorial f = new Factorial();
            Integer result = f.factorial(-10);

            Assertions.assertEquals(3628800, result);
        });
    }



}