package com.gdn.onboarding.day1.gdnDay1.Factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialTest() {
        Integer result = new Factorial().factorial(6);
        Assertions.assertEquals(720,result);
    }
    @Test
    void factorialTest2() {
        Integer result = new Factorial().factorial(3);
        Assertions.assertEquals(6,result);
    }

    @Test
    void factorialTest3() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Integer result = new Factorial().factorial(-1);
            Assertions.assertNotEquals(6,result);
        });
    }
}