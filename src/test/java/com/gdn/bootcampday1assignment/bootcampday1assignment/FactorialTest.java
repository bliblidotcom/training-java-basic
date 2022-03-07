package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private static final Factorial factorial = new Factorial();

    @Test
    public void testGetFactorial_success(){
        Assertions.assertEquals(6, factorial.getFactorial(3));
    }

    @Test
    public void testGetFactorial_failed(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
           Assertions.assertEquals(6,factorial.getFactorial(-1));
        });
    }
}