package com.gdn.onboarding.onboardingjava;

public class Calculator {

    public int add(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        return a + b;
    }

    public int minus(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public Integer divide(int a, int b) {
        if(b == 0){
            return null;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int addResult = obj.add(9, 6);
        System.out.println("hasil penjumlahan :" + addResult);
    }
}
