package com.gdn.onboarding.onboardingjava;

public class LetterGrade {
    private LetterGrade() {}

    private static class LetterGradeHelper {
        private static final LetterGrade INSTANCE = new LetterGrade();
    }

    public char result(int value) {
        char grade;
        if (value <= 40) {
            grade = 'F';
        } else if (value <= 60) {
            grade = 'D';
        } else if (value <= 70) {
            grade = 'C';
        } else if (value <= 85) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        return grade;
    }

    public static LetterGrade getInstance() {
        return LetterGradeHelper.INSTANCE;
    }
}
