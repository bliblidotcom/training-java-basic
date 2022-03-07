package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.FactorialService;

public class FactorialServiceImpl implements FactorialService {
    public FactorialServiceImpl() {
    }

    @Override
    public int countByLoop(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public int countByRecursive(int num) {
        if (num >= 1)
            return num * countByRecursive(num - 1);
        else
            return 1;
    }
}
