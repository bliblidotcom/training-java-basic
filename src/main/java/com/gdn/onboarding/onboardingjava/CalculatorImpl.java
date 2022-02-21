package com.gdn.onboarding.onboardingjava;

import com.gdn.onboarding.onboardingjava.contracts.Calculator;

public class CalculatorImpl implements Calculator {
    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float minus(float a, float b) {
        return a - b;
    }

    @Override
    public float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not supported");
        }
        return a / b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        float value = calculator.add(5, 6);
        System.out.println("a + b = " + value);
    }
}
