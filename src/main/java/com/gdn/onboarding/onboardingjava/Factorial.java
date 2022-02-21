package com.gdn.onboarding.onboardingjava;

import java.util.Scanner;

public class Factorial {

    public static int doFactorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(doFactorial(num));
    }

}
