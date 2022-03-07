package com.gdn.onboarding.java.two.onboardingjava.project;

public class Factorial {

    public Integer factorial(Integer num){
        if(num == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        if(num < 0){
            throw new IllegalArgumentException("Number must above 0");
        }
        if(num == 0) return 0;
        else if(num == 1) return 1;
        return num*factorial(num-1);
    }
}
