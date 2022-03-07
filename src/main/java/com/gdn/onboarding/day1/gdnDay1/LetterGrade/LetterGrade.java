package com.gdn.onboarding.day1.gdnDay1.LetterGrade;

public class LetterGrade {
    public String checkGrade(Integer score){
        if(score==null || score <0) throw new IllegalArgumentException("Score must not be null or less than 0");
        String grade = (score >= 90) ? "A" : (score >= 85) ? "A-" : (score >= 80) ? "B+"
                : (score >= 75) ? "B" : "C";
        return grade;
    }

}
