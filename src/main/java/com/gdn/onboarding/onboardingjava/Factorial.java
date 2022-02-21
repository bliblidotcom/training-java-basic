package com.gdn.onboarding.onboardingjava;

public class Factorial {

    private int num;
    private int res =1;

    public Factorial(int num) {
        this.num = num;
    }

    public int countFactorial() throws Exception{
        if (num < 0){
            throw new Exception();
        }
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
}
