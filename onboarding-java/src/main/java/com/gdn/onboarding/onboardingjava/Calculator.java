package com.gdn.onboarding.onboardingjava;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(9, 6);
        System.out.println("hasil penjumlahan : " + addResult);
    }
}
