package com.gdn.basic.trainingjavabasic;

import org.springframework.boot.SpringApplication;

import java.util.Scanner;

public class LetterGrade {

    public String getLetterGrade(int mark){
        if(mark>85){
            return "A";
        }
        if(mark>75){
            return "AB";
        }
        if(mark>65){
            return "B";
        }
        if(mark>60){
            return "BC";
        }
        if(mark>55){
            return "C";
        }
        if(mark>40){
            return "D";
        }
        return "E";
    }

    public static void main(String[] args) {
        LetterGrade letterGrade = new LetterGrade();

        Scanner in = new Scanner(System.in);
        System.out.println("inputkan angka 0-100 untuk di konversi ke huruf, inputkan negative untuk berhenti");

        int a = in.nextInt();
        while (a>=0){
            System.out.println("Nilai angka:"+letterGrade.getLetterGrade(a));
            System.out.println("inputkan angka 0-100 untuk di konversi ke huruf, inputkan negative untuk berhenti");
            a = in.nextInt();
        }
    }
}
