package com.gdn.onboarding.onboardingjava;

public class Factorial {

    public int getFactorialValue(int n) throws Exception {
        if (n < 0) throw new Exception();
        int result = 1;
        for (; n > 0; n--) result = result * n;
        return result;
    }

}
