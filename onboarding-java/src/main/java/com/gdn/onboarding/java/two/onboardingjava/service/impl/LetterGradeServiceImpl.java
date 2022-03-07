package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.LetterGradeService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LetterGradeServiceImpl implements LetterGradeService {

    private int score;

    public LetterGradeServiceImpl() {
    }

    @Override
    public String convertScoreToLetterGrade(int score) {
        this.setScore(score);
        if(score > 100 || score <0){
            throw new IllegalArgumentException("Score is not valid !");
        }else if (score >= 90){
            return "A";
        } else if (score >= 85){
            return "A-";
        } else if (score >=80){
            return "B+";
        } else if (score >= 75){
            return  "B";
        } else if (score >= 70){
            return  "B-";
        } else if (score >= 65){
            return  "C";
        } else if (score >= 60) {
            return "D";
        } else if (score < 60) {
            return "E";
        } else {
            throw new IllegalArgumentException("Score is not valid !");
        }
    }
}
