package com.gdn.onboarding.java.two.assignment.factorial;

public class Factorial {
    public Integer calculateFactorial(Integer num) {
        if(num == null) {
            throw new NullPointerException("Parameter can not be null!");
        }

        if(num < 0) {
            throw new IllegalArgumentException("Parameter can not be below zero!");
        }

        Integer result = 1;
        while(num > 1) {
            result *= num;
            num--;
        }
        // System.out.println(result);
        return result;
    }
}
