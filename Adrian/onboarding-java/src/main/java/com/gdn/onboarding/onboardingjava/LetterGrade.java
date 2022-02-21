package com.gdn.onboarding.onboardingjava;
import java.util.*;

public class LetterGrade {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter score number : ");
        int score= sc.nextInt();

        String result = LetterGrade.convertGrade(score);
        System.out.println("Result : " + result);
    }

    public static String convertGrade(int score){
        String grade;
        if(score > 85) grade = "A";
        else if (score > 75) grade = "AB";
        else if (score > 65) grade = "B";
        else if (score > 60) grade = "BC";
        else if (score > 55) grade = "C";
        else if (score > 50) grade = "D";
        else grade = "E";

        return grade;
    }
}
