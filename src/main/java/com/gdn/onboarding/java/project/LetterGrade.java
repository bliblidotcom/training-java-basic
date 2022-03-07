package com.gdn.onboarding.java.project;

public class LetterGrade {

    public String getGrade(Integer value) {
        if(value == null) {
            throw new IllegalArgumentException("Value should not be null!");
        }

        if(value < 0 || value > 100) {
            throw new IllegalArgumentException("Value should be 0 to 100");
        }

        if(value >= 90) {
            return "A";
        }
        else if(value >= 80) {
            return "B";
        }
        else if(value >= 70) {
            return "C";
        }
        else {
            return "D";
        }
    }

}
