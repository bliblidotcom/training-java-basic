package com.gdn.onboarding.java.onboardingjava.calcApp;

public class Calculator {
    public Integer add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        return a + b;
    }

    public Integer substract(Integer a, Integer b){
        if (a == null || b == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        return a - b;
    }

    public Integer multiply(Integer a, Integer b){
        if (a == null || b == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        return a * b;
    }

    public Integer divide(Integer a, Integer b){
        if (a == null || b == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        return a / b;
    }
}
