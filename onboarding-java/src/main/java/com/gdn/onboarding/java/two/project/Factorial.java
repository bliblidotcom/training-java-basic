package com.gdn.onboarding.java.two.project;

public class Factorial {
    public Long calculateFactorial(Long value) {
        if(value == null) throw new IllegalArgumentException("Parameter value must not be null.");
        if(value < 0) throw new IllegalArgumentException("Parameter value must be >= 0");

        Long result = Long.valueOf(1);
        for (Long i = value; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
