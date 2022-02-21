package com.gdn.onboarding.onboardingjava;

public class LetterGrade {
    /*
    A = 81 - 100
    B = 61 - 80
    C = 41 - 60
    D = 21 - 40
    E = 0 - 20
     */
    public String convertToLetter(Integer score) throws Exception {
        if (score > 80 && score <= 100) {
            return "A";
        } else if (score > 60) {
            return "B";
        } else if (score > 40) {
            return "C";
        } else if (score > 20) {
            return "D";
        } else if (score > 0){
            return "E";
        } else {
            throw new Exception();
        }
    }
}
