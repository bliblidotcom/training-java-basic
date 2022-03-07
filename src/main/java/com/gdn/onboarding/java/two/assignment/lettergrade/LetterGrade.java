package com.gdn.onboarding.java.two.assignment.lettergrade;

public class LetterGrade {
    public Character gradeScore(Integer score) {
        if(score == null) {
            throw new NullPointerException("Parameter can not be null!");
        }

        if(score < 0 || score > 100) {
            throw new IllegalArgumentException("Score can not be more than 100 or less than 0!");
        }

        if(score >= 90) {
            return 'A';
        }
        else if(score >= 80) {
            return 'B';
        }
        else if(score >= 70) {
            return 'C';
        }
        else if(score >= 60) {
            return 'D';
        }
        else if(score >= 50) {
            return 'E';
        }
        else {
            return 'F';
        }
    }
}
