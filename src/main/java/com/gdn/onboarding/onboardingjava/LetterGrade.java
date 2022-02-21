package com.gdn.onboarding.onboardingjava;

public class LetterGrade {
    public char getGrade(int score) {
        if (score > 89) {
            return 'A';
        } else if (score > 79) {
            return 'B';
        } else if (score > 69) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static void main(String[] args) {
        LetterGrade grade = new LetterGrade();
        char gradeA = grade.getGrade(75);
        char gradeB = grade.getGrade(63);
        char gradeC = grade.getGrade(95);
        System.out.println("nilai matematika : " + gradeA);
        System.out.println("nilai biologi : " + gradeB);
        System.out.println("nilai fisika : " + gradeC);
    }
}