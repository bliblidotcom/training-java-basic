package com.gdn.onboarding.onboardingjava;

import static java.lang.Math.abs;

public class Calculator {
    public static int add(int a, int b){
        return abs(a) + abs(b);
    }

    public static int minus(int a, int b){
        return abs(a) - abs(b);
    }

    public static int multiply(int a, int b){
        return abs(a) * abs(b);
    }

    public static int divide(int a, int b){
        return abs(a) / abs(b);
    }
}
