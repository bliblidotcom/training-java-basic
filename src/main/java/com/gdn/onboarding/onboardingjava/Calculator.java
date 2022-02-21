package com.gdn.onboarding.onboardingjava;

public class Calculator {

    public static int add(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int addResult = Calculator.add(9, 2);
        System.out.println("hasil : " + addResult);
    }
}
