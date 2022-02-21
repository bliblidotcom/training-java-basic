package com.gdn.basic.trainingjavabasic;

import java.util.Scanner;

public class Factorial {
    public int calculateFactorial(int a){
        int ans = 1;
        for(int i=2;i<=a;i++){
            ans*=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int a = in.nextInt();

        while(a>=0){
            System.out.println("Faktorial dari "+a+" adalah "+factorial.calculateFactorial(a));
            System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
            a = in.nextInt();
        }
    }
}
