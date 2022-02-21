package com.gdn.onboarding.onboardingjava;

public class Factorial {
    private int calculateFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        else {
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int factorial1 = factorial.calculateFactorial(1);
        int factorial2 = factorial.calculateFactorial(2);
        int factorial3 = factorial.calculateFactorial(3);
        int factorial4 = factorial.calculateFactorial(4);
        int factorial5 = factorial.calculateFactorial(5);
        int factorial6 = factorial.calculateFactorial(6);

        System.out.println("Factorial of 1 : " + factorial1);
        System.out.println("Factorial of 2 : " + factorial2);
        System.out.println("Factorial of 3 : " + factorial3);
        System.out.println("Factorial of 4 : " + factorial4);
        System.out.println("Factorial of 5 : " + factorial5);
        System.out.println("Factorial of 6 : " + factorial6);
    }
}
