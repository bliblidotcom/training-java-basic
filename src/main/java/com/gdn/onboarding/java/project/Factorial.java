package com.gdn.onboarding.java.project;

public class Factorial {

    public Integer getFactorial(Integer value) {
        if(value == null) {
            throw new IllegalArgumentException("Value should not be null!");
        }

        if(value < 0) {
            throw new IllegalArgumentException("Value should be more than 0!");
        }

        if(value == 0 || value == 1) {
            return 1;
        }

        return value * getFactorial(value - 1);
    }

}
