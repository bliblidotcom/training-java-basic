package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_success() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.add(10, 10);
        if(addResult != 20){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testAdd_failed() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.add(-1, 10);
        if(addResult != 11){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMinus_success() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.minus(1, 10);
        if(addResult != 9){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMinus_failed() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.minus(-1, 10);
        if(addResult != 11){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMultipy_success() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.multiply(5, 5);
        if(addResult != 25){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMultiply_failed() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.multiply(-1, -1);
        if(addResult != 1){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testDivide_success() throws Exception{
        Calculator obj = new Calculator();
        int addResult = obj.divide(-1, 10);
        if(addResult != 0){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testDivide_failed() throws Exception{
        Calculator obj = new Calculator();
        Integer addResult = obj.divide(1, 0);
        if(addResult != null){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }
}
