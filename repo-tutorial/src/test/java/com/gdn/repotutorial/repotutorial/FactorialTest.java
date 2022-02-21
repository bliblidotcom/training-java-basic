package com.gdn.repotutorial.repotutorial;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void calculateFactorialTest() throws Exception{
        int result = new Factorial().calculateFactorial(5);
        if(result != 120){
            System.out.println("Test Fail");
            throw new Exception();
        }
    }
}
