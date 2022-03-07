package com.gdn.onboarding.java.pseudocode;

public class Factorial {

    public Integer getFactorial(Integer number){
        int factorial = 1;
        for(int a = 1; a <= number; a++){
            factorial *= a;
        }
        return factorial;
    }

}
