package com.gdn.onboarding.java.onboardingjava.calc;

public class Calculator {

    public Integer add(Integer int1, Integer int2){
        if(int1 == null || int2 == null ){
            throw new IllegalArgumentException("param ga bole null");
        }
        return int1 + int2;
    }

    public Integer minus(Integer int1, Integer int2){
        if(int1 == null || int2 == null ){
            throw new IllegalArgumentException("param ga bole null");
        }
        return int1 - int2;
    }

    public Integer divide(Integer int1, Integer int2){
        if(int1 == null || int2 == null ){
            throw new IllegalArgumentException("param ga bole null");
        }
        return int1 / int2;
    }

    public Integer multiply(Integer int1, Integer int2){
        if(int1 == null || int2 == null ){
            throw new IllegalArgumentException("param ga bole null");
        }
        return int1 * int2;
    }


}
