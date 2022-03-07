package com.gdn.onboarding.java.two.project;

public class LetterGrade {
    public String gradeNow(Integer value) {
        if(value == null) throw new IllegalArgumentException("Value must not be null.");
        if(value < 0 || value > 100) throw new IllegalArgumentException("Value must be between 0-100 inclusive.");
        if(value >= 80) return "A";
        if(value >= 60) return "B";
        if(value >= 40) return "C";
        if(value >= 20) return "D";
        return "E";
    }
}
