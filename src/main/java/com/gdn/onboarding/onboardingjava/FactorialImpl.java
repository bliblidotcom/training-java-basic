package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.Factorial;

public class FactorialImpl implements Factorial {
    @Override
    public int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
