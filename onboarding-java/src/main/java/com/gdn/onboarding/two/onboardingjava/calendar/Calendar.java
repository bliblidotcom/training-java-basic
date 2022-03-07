package com.gdn.onboarding.two.onboardingjava.calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calendar {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public Calendar(){

    }

    public String checkMonths(Integer input){
        String answer = "";

        if(input == null || (input < 1 || input > 12)){
            throw new IllegalArgumentException("Parameters might be null or out of calendar range");
        }

        switch (input){
            case 1:
                answer = "January";
                logger.info("January");
                break;
            case 2:
                answer = "February";
                logger.info("February");
                break;
            case 3:
                answer = "March";
                logger.info("March");
                break;
            case 4:
                answer = "April";
                logger.info("April");
                break;
            case 5:
                answer = "Mei";
                logger.info("Mei");
                break;
            case 6:
                answer = "June";
                logger.info("June");
                break;
            case 7:
                answer = "July";
                logger.info("July");
                break;
            case 8:
                answer = "August";
                logger.info("August");
                break;
            case 9:
                answer = "September";
                logger.info("September");
                break;
            case 10:
                answer = "October";
                logger.info("October");
                break;
            case 11:
                answer = "November";
                logger.info("November");
                break;
            case 12:
                answer = "December";
                logger.info("December");
                break;
        }
        return answer;
    }

}
