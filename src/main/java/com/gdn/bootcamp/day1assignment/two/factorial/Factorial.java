package com.gdn.bootcamp.day1assignment.two.factorial;

public class Factorial {

    public Integer compute(Integer n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Negative number is not supported");
        }

        Integer result = 1;
        for (Integer i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
