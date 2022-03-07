package com.gdn.bootcamp.bootcamp.unitTest;

import com.gdn.bootcamp.bootcamp.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    Factorial factorial;

    @BeforeEach
    public void setUp(){
        factorial = new Factorial();
    }

    @Test
    public void testFactorial_success(){
        Integer result = factorial.getFactorialOf(4);
        Assertions.assertEquals(result, 24);
    }

    @Test
    public void testFactorial1_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Integer result = factorial.getFactorialOf(-5);
        });
    }

    @Test
    public void testFactorial2_fail(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Integer result = factorial.getFactorialOf(null);
        });
    }
}
