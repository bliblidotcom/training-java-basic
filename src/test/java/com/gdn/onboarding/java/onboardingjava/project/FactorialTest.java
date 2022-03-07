package com.gdn.onboarding.java.onboardingjava.project;

import com.gdn.onboarding.java.onboardingjava.project.factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void getFactorialTest(){
        Factorial f = new Factorial();
        Integer result = f.getFactorial(5);
        Assertions.assertEquals(120, result);
    }
}
