package com.gdn.bootcamp.bootcamp.grade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Grade {
    public Boolean validate(Integer score){
        if(score == null){
            log.error("Invalid Parameters!");
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        if(score < 0 || score > 100){
            log.error("Invalid Parameters!");
            throw new IllegalArgumentException("Invalid Parameters!");
        }
        return true;
    }

    public String getGrade(Integer score){
        if(score < 50) return "F";
        else if(score < 60) return "E";
        else if(score < 70) return "D";
        else if(score < 80) return "C";
        else if(score < 90) return "B";
        else return "A";
    }

    public String convertGrade(Integer score){
        validate(score);
        return getGrade(score);
    }
}
