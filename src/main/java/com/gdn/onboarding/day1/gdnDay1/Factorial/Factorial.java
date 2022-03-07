package com.gdn.onboarding.day1.gdnDay1.Factorial;

public class Factorial {
    public Integer factorial(Integer value){
        if(value<0 || value == null) throw new IllegalArgumentException("Value must not be null or less than 0");
        if(value==0||value==1) return 1;
        else return value * factorial(value-1);
    }
}
