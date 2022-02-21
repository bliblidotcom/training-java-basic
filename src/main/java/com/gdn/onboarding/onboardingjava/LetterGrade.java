package com.gdn.onboarding.onboardingjava;

public class LetterGrade {
    public String getGrade(int point) {
        if (point > 80) {
            return "A";
        } else if (point > 74) {
            return "AB";
        } else if (point > 69) {
            return "B";
        } else if (point > 64) {
            return "BC";
        } else if (point > 59) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        LetterGrade grader = new LetterGrade();
        String grade1 = grader.getGrade(90);
        String grade2 = grader.getGrade(78);
        String grade3 = grader.getGrade(72);
        String grade4 = grader.getGrade(68);
        String grade5 = grader.getGrade(62);
        String grade6 = grader.getGrade(58);

        System.out.println("Nilai Mata Kuliah 1 : " + grade1);
        System.out.println("Nilai Mata Kuliah 2 : " + grade2);
        System.out.println("Nilai Mata Kuliah 3 : " + grade3);
        System.out.println("Nilai Mata Kuliah 4 : " + grade4);
        System.out.println("Nilai Mata Kuliah 5 : " + grade5);
        System.out.println("Nilai Mata Kuliah 6 : " + grade6);
    }
}
