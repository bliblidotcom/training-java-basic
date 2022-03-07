package com.gdn.onboarding.day1.gdnDay1.Calendar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calendar {
    public Logger log = LoggerFactory.getLogger(Calendar.class);
    public String printCalendar(Integer n){
        String month = null;
        if(n == null){
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        switch(n)
        {
            case 1:
                log.info("January");
                month = "January";
                break;
            case 2:
                log.info("February");
                month = "February";
                break;
            case 3:
                log.info("March");
                month = "March";
                break;
            case 4:
                log.info("April");
                month = "April";
                break;
            case 5:
                log.info("May");
                month = "May";
                break;
            case 6:
                log.info("June");
                month = "June";
                break;
            case 7:
                log.info("July");
                month = "July";
                break;
            case 8:
                log.info("August");
                month = "August";
                break;
            case 9:
                log.info("September");
                month = "September";
                break;
            case 10:
                log.info("October");
                month = "October";
                break;
            case 11:
                log.info("November");
                month = "November";
                break;
            case 12:
                log.info("December");
                month = "December";
                break;
            default:
                throw new IllegalArgumentException("Invalid number");

        }
        return month;
    }
}
