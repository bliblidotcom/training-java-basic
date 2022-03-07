package com.gdn.onboarding.java.pseudocode;

public class LetterGrade {

    public String getGrade(Integer score){
        if(score >= 90) return "A";
        else if(score >= 85) return "A-";
        else if(score >= 80) return "B+";
        else if(score >= 75) return "B";
        else if(score >= 70) return "B-";
        else if(score >= 65) return "C";
        else if(score >= 50) return "D";
        else if(score >= 0) return "E";
        else return "F";
    }

}
