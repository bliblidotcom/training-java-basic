package com.gdn.onboarding.java.onboardingjava.project.lettergrade;

public class LetterGrade {

    public String getGrade(Integer score){
        if(score >= 90){
            return "A";
        }else if (score >= 80){
            return "B";
        }else if (score >= 70){
            return "C";
        }else if (score >= 60){
            return "D";
        }else{
            return "E";
        }
    }

}
