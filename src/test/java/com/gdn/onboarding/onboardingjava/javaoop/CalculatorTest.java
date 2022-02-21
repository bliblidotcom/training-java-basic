package com.gdn.onboarding.onboardingjava.javaoop;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd_success() throws Exception {
        int addResult = new Calculator().add(10,10);
        if(addResult != 20){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testAdd_failed() throws Exception{
        int addResult = new Calculator().add(-1,10);
        if(addResult != 11){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testSubstract_success() throws Exception{
        int addResult = new Calculator().substract(10,5);
        if(addResult != 5){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testSubstract_failed() throws Exception{
        int addResult = new Calculator().substract(3,10);
        if(addResult != 7){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMultiply_success() throws Exception{
        int addResult = new Calculator().multiply(3,10);
        if(addResult != 30){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testMultiply_failed() throws Exception{
        int addResult = new Calculator().multiply(2,-10);
        if(addResult != 20){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testDivide_success() throws Exception{
        int addResult = new Calculator().divide(20,10);
        if(addResult != 2){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }

    @Test
    public void testDivide_failed() throws Exception{
        int addResult = new Calculator().divide(20,-10);
        if(addResult != 2){
            System.out.println("GAGAL");
            throw new Exception();
        }
    }


}
