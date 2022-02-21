package com.gdn.onboarding.onboardingjava;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class FactorialTest {

    @Test
    public void testCountFactorial_success() throws Exception{

        Factorial number = new Factorial(5);


        if (number.countFactorial() != 120){
            System.out.println("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void testCountFactorial_fail() throws Exception{

        Factorial number = new Factorial(4);


        if (number.countFactorial() == 120){
            System.out.println("Test Failed");
            throw new Exception();
        }
    }

    @Test
    public void testCountFactorial_error() throws Exception{

        Factorial number = new Factorial(-10);
        Assertions.assertThrows(Exception.class, () -> number.countFactorial());
    }
}
