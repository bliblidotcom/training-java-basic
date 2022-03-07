package com.gdn.onboarding.two.onboardingjava.letterGrade;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterGrade {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    public LetterGrade() {

    }


    public String checkGrade(Integer input){
        if(input == null){
            throw new IllegalArgumentException("Input cant be null");
        }

        if(input < 65){
            logger.info("Your score has been converted and equals to D");
            return "D";
        }else if(input < 70 ){
            logger.info("Your score has been converted and equals to C");
            return "C";
        }else if(input < 75 ){
            logger.info("Your score has been converted and equals to B-");
            return "B-";
        }else if(input < 80 ){
            logger.info("Your score has been converted and equals to B");
            return "B";
        }else if(input < 85 ){
            logger.info("Your score has been converted and equals to B+");
            return "B+";
        }else if(input < 90 ){
            logger.info("Your score has been converted and equals to A-");
            return "A-";
        }else if(input < 100 ){
            logger.info("Your score has been converted and equals to A");
            return "A";
        }else{
            logger.info("Your score is invalid because it is more than 100");
            throw new IllegalArgumentException("Score out of bound to be converted");
        }



    }


}
