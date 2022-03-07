package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    private static CalculatorService calculatorServiceImpl;

    public CalculatorServiceImpl() {
    }

    public static CalculatorServiceImpl getInstance() {
        if (calculatorServiceImpl == null) {
            calculatorServiceImpl = new CalculatorServiceImpl();
        }
        return (CalculatorServiceImpl) calculatorServiceImpl;
    }

    @Override
    public Integer add(Integer int_1, Integer int_2) {
        isIntegerNull(int_1, int_2);
        return int_1 + int_2;
    }

    @Override
    public Integer minus(Integer int_1, Integer int_2) {
        isIntegerNull(int_1, int_2);
        return int_1 - int_2;
    }

    @Override
    public Integer multiply(Integer int_1, Integer int_2) {
        isIntegerNull(int_1, int_2);
        return int_1 * int_2;
    }

    @Override
    public Integer divide(Integer int_1, Integer int_2) {
        isIntegerNull(int_1, int_2);
        return int_1 / int_2;
    }

    @Override
    public void isIntegerNull(Integer int_1, Integer int_2) {
        if (int_1 == null || int_2 == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
    }
}
