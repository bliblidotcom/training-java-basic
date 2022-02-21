package com.gdn.basic.trainingjavabasic;

import java.util.Scanner;

public class Calender {

    public String convertToMonth(int a){
        switch (a){
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "Invalid input";
        }
    }
    public static void main(String[] args) {
        Calender calender = new Calender();

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1-12 untuk di ubah menjadi bulan: ");
        int a = in.nextInt();
        while (a>0 && a<13){
            System.out.println("Bulan ke "+a+" adalah "+calender.convertToMonth(a));
            System.out.print("Masukkan angka 1-12 untuk di ubah menjadi bulan: ");
            a = in.nextInt();
        }
    }
}
