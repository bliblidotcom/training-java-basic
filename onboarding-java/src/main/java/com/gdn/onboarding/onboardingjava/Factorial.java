package com.gdn.onboarding.onboardingjava;

public class Factorial {

    public int calculateFactorial(int n) {
        int result = 1;
        for(int i=n; i>=1; i--) result *= i;
        return result;
    }
}
