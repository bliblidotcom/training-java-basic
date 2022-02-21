package com.gdn.onboarding.onboardingjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int number= sc.nextInt();

        int result = Factorial.fact(number);
        System.out.println("Result : " + result);
    }

    public static int fact(int value){
        int score = 1;
        for(int a=1; a<=value; a++) score *= a;
        return score;
    }
}
