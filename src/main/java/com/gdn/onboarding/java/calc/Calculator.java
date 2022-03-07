package com.gdn.onboarding.java.calc;

public class Calculator {

    public Integer add(Integer int1, Integer int2) {
        validate(int1, int2);

        return int1 + int2;
    }

    private void validate(Integer int1, Integer int2) {
        if(int1 == null || int2 == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
    }

    public Integer minus(Integer int1, Integer int2) {
        validate(int1, int2);

        return int1 - int2;
    }

    public Integer multiply(Integer int1, Integer int2) {
        validate(int1, int2);

        return int1 * int2;
    }

    public Integer divide(Integer int1, Integer int2) {
        validate(int1, int2);

        return int1 / int2;
    }

}
