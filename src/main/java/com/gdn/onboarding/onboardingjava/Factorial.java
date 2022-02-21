package com.gdn.onboarding.onboardingjava;

public class Factorial {
    protected int countFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int factorialA = factorial.countFactorial(5);

        System.out.println("factorial of 5 : " + factorialA);
    }
}
