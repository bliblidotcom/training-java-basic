package com.gdn.onboarding.onboardingjava;

public class Factorial {
    private Factorial() {}

    private static class FactorialHelper {
        private static final Factorial INSTANCE = new Factorial();
    }

    public Integer calculation(int number) {
        if (number < 0) {
            return null;
        }

        int result = 1;
        for (int i = 2; i <= number; ++i) {
            result *= i;
        }

        return result;
    }

    public static Factorial getInstance() {
        return FactorialHelper.INSTANCE;
    }
}
