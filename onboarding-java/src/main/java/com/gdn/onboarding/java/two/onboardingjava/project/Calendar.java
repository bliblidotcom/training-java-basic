package com.gdn.onboarding.java.two.onboardingjava.project;

public class Calendar {
    public String calendar(Integer number){
        if(number == null){
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        if(number < 1 || number > 12){
            throw new IllegalArgumentException("Number must be between 1 and 12");
        }
        switch (number){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }
        return "";
    }
}
