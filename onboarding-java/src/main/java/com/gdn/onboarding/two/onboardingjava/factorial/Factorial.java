package com.gdn.onboarding.two.onboardingjava.factorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public Factorial(){

    }

    public Integer countFactorial(Integer input){
        int answer = 1;

        if(input == null){
            throw new IllegalArgumentException("Input cannot be null");
        }

        for(int i=input ; i >= 1 ; i--){
            answer *= i;
        }

        logger.info("The factorial value is {}", answer);
        return answer;
    }
}
