package com.gdn.onboarding.onboardingjava;

public class Factorial {
    private Integer sum = 1;
    public Integer fact(Integer n) throws Exception {
        if (n < 0) {
            throw new Exception();
        } else {
            for (Integer i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }
    }
}
