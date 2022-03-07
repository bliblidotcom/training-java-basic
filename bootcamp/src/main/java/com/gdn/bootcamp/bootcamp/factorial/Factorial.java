package com.gdn.bootcamp.bootcamp.factorial;

public class Factorial {

    public void validate(Integer n){
        if(n == null){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        if(n < 0){
            throw new IllegalArgumentException("Invalid Parameters!");
        }
    }

    public Integer getFactorialOf(Integer n){
        validate(n);
        Integer result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
