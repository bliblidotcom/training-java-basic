package com.gdn.repotutorial.repotutorial;

import java.util.Scanner;

public class Factorial {

    public int calculateFactorial(int num){
        int total = 1;
        for(int i = 1; i <= num; i++){
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Input angka : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Factorial factorial = new Factorial();
        int total = factorial.calculateFactorial(num);
        System.out.println("Faktorial = " + total);
    }
}
