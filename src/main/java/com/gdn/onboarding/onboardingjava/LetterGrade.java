package com.gdn.onboarding.onboardingjava;

public class LetterGrade {

    private int score;

    public LetterGrade(int score){

        this.score = score;
    }

    public String showScore() throws Exception{
        if (score > 100){
            throw new Exception();
        } else if (score > 80){
            return "A";
        } else if (score > 75){
            return "AB";
        } else if (score > 70){
            return "B";
        } else if (score > 65){
            return  "BC";
        } else if (score > 60){
            return  "C";
        } else if (score > 55){
            return  "D";
        } else if (score > -1) {
            return "E";
        } else {
            throw new Exception();
        }
    }
}
