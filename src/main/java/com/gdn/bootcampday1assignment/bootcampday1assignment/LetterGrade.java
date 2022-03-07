package com.gdn.bootcampday1assignment.bootcampday1assignment;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class LetterGrade {

    public String getGrade(Integer score){

        if(score == null){
            throw new IllegalArgumentException("Score must exist");
        }
        if(score < 0){
            throw new IllegalArgumentException("Score must greater than or equal 0");
        }
        if(score > 90){
            return "A";
        }
        if(score >85){
            return "A-";
        }
        if(score > 80){
            return "B+";
        }
        if(score > 75){
            return "B";
        }
        if(score > 70){
            return "B-";
        }
        if(score > 65){
            return "C";
        }
        if(score > 50){
            return "D";
        }
        if(score > 0){
            return "E";
        }
        return "F";
    }
}
