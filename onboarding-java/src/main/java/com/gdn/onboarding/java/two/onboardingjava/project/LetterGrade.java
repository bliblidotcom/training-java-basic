package com.gdn.onboarding.java.two.onboardingjava.project;

public class LetterGrade {
    public String doGrade(Integer score){
        if(score == null){
            throw new IllegalArgumentException("Score cannot be null");
        }
        if(score > 100 || score < 0){
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if(score < 90 && score >= 85){
            return "A-";
        }
        else if(score < 85 && score >= 80){
            return "B+";
        }
        else if(score < 80 && score >= 75 ){
            return "B";
        }
        else if(score < 75 && score >= 70){
            return "B-";
        }
        else if(score < 70 && score >= 65){
            return "C";
        }
        else if(score < 65 && score >= 50){
            return "D";
        }
        else if(score < 50){
            return "E";
        }
        return "A";
    }

}
