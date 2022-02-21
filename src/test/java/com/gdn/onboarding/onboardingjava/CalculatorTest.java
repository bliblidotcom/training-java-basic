package com.gdn.onboarding.onboardingjava;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CalculatorTest {

    @Test
    public void testAdd_success() throws Exception{
        int addResult = Calculator.add(10,10);
        log.info("Ingfo");
        if (addResult != 20){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMinus_success() throws Exception{
        int addResult = Calculator.minus(10,5);
        if (addResult != 5){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testDivide_success() throws Exception{
        int addResult = Calculator.divide(10,2);
        if (addResult != 5){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMultiply_success() throws Exception{
        int addResult = Calculator.multiply(10,10);
        if (addResult != 100){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }
}
