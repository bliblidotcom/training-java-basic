package com.gdn.onboarding.onboardingjava;

import java.util.Scanner;

public class LetterGrade {
    public static String getLetterGrade(int grade) {
        String letterGrade;
        if (grade >= 0 && grade <= 100) {
            if (grade >= 85) {
                letterGrade = "A";
            } else if (grade >= 75){
                letterGrade = "AB";
            } else if (grade >= 65) {
                letterGrade = "B";
            } else if (grade >= 55) {
                letterGrade = "C";
            } else if (grade >= 40) {
                letterGrade = "D";
            } else letterGrade = "E";
        } else letterGrade = "-";

        return letterGrade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your grade here :");
        int grade = sc.nextInt();
        System.out.println(LetterGrade.getLetterGrade(grade));

    }
}
