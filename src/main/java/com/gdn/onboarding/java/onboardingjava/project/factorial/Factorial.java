package com.gdn.onboarding.java.onboardingjava.project.factorial;

public class Factorial {

    public Integer getFactorial(Integer number){
        int result = 1;
        for (int i= 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
}
