package com.gdn.onboarding.onboardingjava;

public class Calculator {

    public static int add(int a,int b){
        return a+b;
    }

    public static int minus(int a,int b){
        return a-b;
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        int addResult = Calculator.add(3, 5);
        System.out.println(addResult);
    }
}
