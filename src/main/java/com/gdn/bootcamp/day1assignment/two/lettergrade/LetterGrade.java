package com.gdn.bootcamp.day1assignment.two.lettergrade;

public class LetterGrade {

    public String getLetterGrade(Double numberGrade) {
        if (numberGrade == null) {
            throw new IllegalArgumentException("Number grade cannot be null ");
        }


        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number grade must be between 0 and 100");
        }


        if (numberGrade >= 90) {
            return "A";
        } else if (numberGrade >= 80) {
            return "B";
        } else if (numberGrade >= 70) {
            return "C";
        } else if (numberGrade >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
